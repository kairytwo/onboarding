package com.redhat.lab.usecase;

import com.redhat.lab.core.domain.entity.*;
import com.redhat.lab.core.domain.exception.InvalidPasswordException;
import com.redhat.lab.core.domain.repository.CaseRepository;
import com.redhat.lab.core.domain.service.OnboardingService;

public class OnboardingApplicationServiceImpl implements OnboardingApplicationService {

    OnboardingService onboardingService;
    ExternalCreditCardValidator externalCreditCardValidator;
    CaseRepository caseRepository;

    public OnboardingApplicationServiceImpl(OnboardingService onboardingService, ExternalCreditCardValidator externalCreditCardValidator, CaseRepository caseRepository) {
        this.onboardingService = onboardingService;
        this.externalCreditCardValidator = externalCreditCardValidator;
        this.caseRepository = caseRepository;
    }

    @Override
    public CaseDo raiseCase(String productKind) {
        return onboardingService.raiseCase(productKind);
    }

    @Override
    public AttachmentDo uploadAttachment(String caseId, AttachmentDo.AttaKind attaKind, String content) {
        return onboardingService.uploadAttachment(caseId, attaKind, content);
    }

    @Override
    public AccountDo createAccount(String userId, String earthId, String password) throws InvalidPasswordException {
        return onboardingService.createAccount(userId, earthId, password);
    }

    @Override
    public CaseDo writeBasicInfo(String caseId, BasicInfoDo basicInfo, String cardNo, String cardValidDate) {
        CreditCardVerify creditCardVerify = externalCreditCardValidator.validate(cardNo, cardValidDate, basicInfo.getCellPhone());
        try {
            onboardingService.writeBasicInfo(caseId, basicInfo);
        } catch (com.redhat.lab.core.domain.exception.CaseNotExistException e) {
            e.printStackTrace();
        }
        onboardingService.setCreditCardVerify(caseId, creditCardVerify);

        return caseRepository.findByCaseId(caseId);
    }

    @Override
    public CaseDo setCaseStatusReviewing(String caseId) {
        return onboardingService.setCaseStatusReviewing(caseId);
    }

    @Override
    public CaseDo reviewCaseSuccess(String caseId) {
        return onboardingService.reviewCaseSuccess(caseId);
    }

    @Override
    public CaseDo reviewCaseFailed(String caseId) {
        return onboardingService.reviewCaseFailed(caseId);
    }
}
