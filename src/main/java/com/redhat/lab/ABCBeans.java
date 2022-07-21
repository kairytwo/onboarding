package com.redhat.lab;

import com.redhat.lab.core.domain.repository.AccountRepository;
import com.redhat.lab.core.domain.repository.CaseRepository;
import com.redhat.lab.core.domain.service.OnboardingService;
import com.redhat.lab.core.domain.service.OnboardingServiceImpl;
import com.redhat.lab.infrastructure.persistent.AccountRepositoryImpl;
import com.redhat.lab.infrastructure.persistent.CaseRepositoryImpl;
import com.redhat.lab.usecase.ExternalCreditCardValidator;
import com.redhat.lab.usecase.OnboardingApplicationService;
import com.redhat.lab.usecase.OnboardingApplicationServiceImpl;
import com.redhat.lab.usecase.external.ExternalCreditCardValidatorImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ABCBeans {

    @Bean
    public OnboardingServiceImpl onboardingService(CaseRepository caseRepository, AccountRepository accountRepository) {
        return new OnboardingServiceImpl(caseRepository, accountRepository);
    }

    @Bean
    public CaseRepository caseRepository() {
        return new CaseRepositoryImpl();
    }

    @Bean
    public AccountRepository accountRepository() {
        return new AccountRepositoryImpl();
    }

    @Bean
    public ExternalCreditCardValidator externalCreditCardValidator() {
        return new ExternalCreditCardValidatorImpl();
    }

    @Bean
    public OnboardingApplicationService onboardingApplicationService(OnboardingService onboardingService, ExternalCreditCardValidator externalCreditCardValidator, CaseRepository caseRepository) {
        return new OnboardingApplicationServiceImpl(onboardingService, externalCreditCardValidator, caseRepository);
    }
}
