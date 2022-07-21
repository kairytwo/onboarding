package com.redhat.lab.core.domain.service;

import com.redhat.lab.core.domain.repository.AccountRepository;
import com.redhat.lab.core.domain.repository.CaseRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Matchers.any;

class OnboardingServiceImplTest {

    @Test
    void raiseCase() {
        CaseRepository caseRepository = Mockito.mock(CaseRepository.class);
        AccountRepository accountRepository = Mockito.mock(AccountRepository.class);

        OnboardingService onboardingService = new OnboardingServiceImpl(caseRepository, accountRepository);

        onboardingService.raiseCase("bank");
        Mockito.verify(caseRepository).save(any());
    }
}