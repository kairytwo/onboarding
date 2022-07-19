package com.redhat.lab.infrastructure.persistent;

import com.redhat.lab.core.domain.entity.Account;
import com.redhat.lab.core.domain.repository.AccountRepository;

import java.util.HashMap;

public class AccountRepositoryImpl implements AccountRepository {

    HashMap<String, Account> map = new HashMap<>();

    @Override
    public void save(Account account) {
        map.put(account.getAccountId(), account);
    }
}
