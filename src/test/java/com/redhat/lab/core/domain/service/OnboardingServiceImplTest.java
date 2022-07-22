package com.redhat.lab.core.domain.service;

import com.redhat.lab.core.domain.entity.CaseDo;
import com.redhat.lab.core.domain.repository.AccountRepository;
import com.redhat.lab.core.domain.repository.CaseRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.UUID;

//import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Matchers.any;

import static org.mockito.Mockito.times;

class OnboardingServiceImplTest {

    @Test
    void raiseCase() {
        CaseRepository caseRepository = Mockito.mock(CaseRepository.class);
        AccountRepository accountRepository = Mockito.mock(AccountRepository.class);

        OnboardingService onboardingService = new OnboardingServiceImpl(caseRepository, accountRepository);

        CaseDo caseDo = onboardingService.raiseCase("bank");

        assertThat(isUUID(caseDo.getCaseId()), is(true));
        assertThat(caseDo.getProductKind(), equalTo("bank"));
        assertThat(caseDo.getStatus(), equalTo(CaseDo.Status.APPLYING));
        Mockito.verify(caseRepository, times(1)).save(caseDo);
    }

    private boolean isUUID(String uuid) {
        try {
            UUID.fromString(uuid);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}