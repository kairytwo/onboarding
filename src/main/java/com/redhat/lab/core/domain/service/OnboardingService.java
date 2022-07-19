package com.redhat.lab.core.domain.service;

import com.redhat.lab.core.domain.entity.Account;
import com.redhat.lab.core.domain.entity.Attachment;
import com.redhat.lab.core.domain.entity.BasicInfo;
import com.redhat.lab.core.domain.entity.Case;
import com.redhat.lab.core.domain.repository.AccountRepository;
import com.redhat.lab.core.domain.repository.CaseRepository;

public class OnboardingService {

    CaseRepository caseRespository;
    AccountRepository accountRepository;

    public OnboardingService(CaseRepository caseRespository, AccountRepository accountRepository) {
        this.caseRespository = caseRespository;
        this.accountRepository = accountRepository;
    }

    // action 1
    public Case raiseCase(String productKind) {
        Case aCase = Case.create(productKind);
        caseRespository.save(aCase);
        return aCase;
    }

    // action 2
    public void uploadAttachment(String caseId, Attachment.AttaKind attaKind, String content) {
        Case aCase = caseRespository.findByCaseId(caseId);
        Attachment attachment = Attachment.create(attaKind, content);
        aCase.addAttachment(attachment);
        caseRespository.save(aCase);
    }

    public Account createAccount(String userId, String earthId, String password) {
        Account account = Account.create(earthId, password, userId);
        accountRepository.save(account);
        return account;
    }

    public Case writeBasicInfo(String caseId, BasicInfo basicInfo) {
        Case aCase = caseRespository.findByCaseId(caseId);
        aCase.setBasicInfo(basicInfo);
        caseRespository.save(aCase);
        return aCase;
    }

    public Case setCaseStatusReviewing(String caseId) {
        Case aCase = caseRespository.findByCaseId(caseId);
        aCase.review();
        caseRespository.save(aCase);
        return aCase;
    }

    public Case reviewCaseSuccess(String caseId) {
        Case aCase = caseRespository.findByCaseId(caseId);
        aCase.completeSuccess();
        caseRespository.save(aCase);
        return aCase;
    }

    public Case reviewCaseFailed(String caseId) {
        Case aCase = caseRespository.findByCaseId(caseId);
        aCase.completeFail();
        caseRespository.save(aCase);
        return aCase;
    }
}
