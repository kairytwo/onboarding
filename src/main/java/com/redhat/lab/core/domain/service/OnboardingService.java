package com.redhat.lab.core.domain.service;

import com.redhat.lab.core.domain.entity.*;
import com.redhat.lab.core.domain.exception.CaseNotExistException;
import com.redhat.lab.core.domain.exception.InvalidPasswordException;

public interface OnboardingService {
    // action 1
    CaseDo raiseCase(String productKind);

    // action 2
    AttachmentDo uploadAttachment(String caseId, AttachmentDo.AttaKind attaKind, String content);

    AccountDo createAccount(String userId, String earthId, String password) throws InvalidPasswordException;

    CaseDo writeBasicInfo(String caseId, BasicInfoDo basicInfo) throws CaseNotExistException;

    CaseDo setCreditCardVerify(String caseId, CreditCardVerify creditCardVerify);

    CaseDo setCaseStatusReviewing(String caseId);

    CaseDo reviewCaseSuccess(String caseId);

    CaseDo reviewCaseFailed(String caseId);


}
