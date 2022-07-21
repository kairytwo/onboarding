package com.redhat.lab.usecase;

import com.redhat.lab.core.domain.entity.AccountDo;
import com.redhat.lab.core.domain.entity.AttachmentDo;
import com.redhat.lab.core.domain.entity.BasicInfoDo;
import com.redhat.lab.core.domain.entity.CaseDo;
import com.redhat.lab.core.domain.exception.InvalidPasswordException;

public interface OnboardingApplicationService {

    CaseDo raiseCase(String productKind);

    // action 2
    AttachmentDo uploadAttachment(String caseId, AttachmentDo.AttaKind attaKind, String content);

    AccountDo createAccount(String userId, String earthId, String password) throws InvalidPasswordException;

    CaseDo writeBasicInfo(String caseId, BasicInfoDo basicInfo, String cardNo, String cardValidDate);

    CaseDo setCaseStatusReviewing(String caseId);

    CaseDo reviewCaseSuccess(String caseId);

    CaseDo reviewCaseFailed(String caseId);
}
