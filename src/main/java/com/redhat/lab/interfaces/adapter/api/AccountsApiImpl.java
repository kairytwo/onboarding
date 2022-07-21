package com.redhat.lab.interfaces.adapter.api;

import com.redhat.lab.interfaces.dto.Account;
import com.redhat.lab.interfaces.dto.NewAccount;
import com.redhat.lab.usecase.OnboardingApplicationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AccountsApiImpl implements AccountsApi {

    OnboardingApplicationService onboardingApplicationService;

    public AccountsApiImpl(OnboardingApplicationService onboardingApplicationService) {
        this.onboardingApplicationService = onboardingApplicationService;
    }

    @Override
    public ResponseEntity<Account> accountsAccountIdGet(String accountId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> accountsAccountIdPut(String accountId, Account account) {
        return null;
    }

    @Override
    public ResponseEntity<List<Account>> accountsGet() {
        return null;
    }

    @Override
    public ResponseEntity<String> accountsPost(NewAccount newAccount) {
        ResponseEntity<String> response;
        try {
            onboardingApplicationService.createAccount(
                    newAccount.getUserId(),
                    newAccount.getEarthId(),
                    newAccount.getPassword()
            );

            response = new ResponseEntity<>("Success", HttpStatus.OK);
        } catch (com.redhat.lab.core.domain.exception.InvalidPasswordException e) {
            response = new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
            e.printStackTrace();
        }

        return response;
    }
}
