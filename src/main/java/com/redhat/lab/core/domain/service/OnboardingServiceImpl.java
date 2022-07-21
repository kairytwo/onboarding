package com.redhat.lab.core.domain.service;

import com.redhat.lab.core.domain.entity.*;
import com.redhat.lab.core.domain.exception.CaseNotExistException;
import com.redhat.lab.core.domain.exception.InvalidPasswordException;
import com.redhat.lab.core.domain.repository.AccountRepository;
import com.redhat.lab.core.domain.repository.CaseRepository;

public class OnboardingServiceImpl implements OnboardingService {

    CaseRepository caseRespository;
    AccountRepository accountRepository;

    public OnboardingServiceImpl(CaseRepository caseRespository, AccountRepository accountRepository) {
        this.caseRespository = caseRespository;
        this.accountRepository = accountRepository;
    }

    // action 1
    @Override
    public CaseDo raiseCase(String productKind) {
        CaseDo aCaseDo = CaseDo.create(productKind);
        caseRespository.save(aCaseDo);
        return aCaseDo;
    }

    // action 2
    @Override
    public AttachmentDo uploadAttachment(String caseId, AttachmentDo.AttaKind attaKind, String content) {
        CaseDo aCaseDo = caseRespository.findByCaseId(caseId);
        AttachmentDo attachmentDo = AttachmentDo.create(attaKind, content);
        aCaseDo.addAttachment(attachmentDo);
        caseRespository.save(aCaseDo);

        return attachmentDo;
    }

    @Override
    public AccountDo createAccount(String userId, String earthId, String password) throws InvalidPasswordException {

        if (password.length() < 4) {
            throw new InvalidPasswordException(String.format("your password's length is %d", password.length()));
        }

        AccountDo account = AccountDo.create(earthId, password, userId);
        accountRepository.save(account);
        return account;
    }

    @Override
    public CaseDo writeBasicInfo(String caseId, BasicInfoDo basicInfo) throws CaseNotExistException {
        CaseDo aCaseDo = caseRespository.findByCaseId(caseId);
        if (aCaseDo == null) {
            throw new CaseNotExistException(String.format("Case id: %s does not exist", caseId));
        }
        aCaseDo.setBasicInfo(basicInfo);
        caseRespository.save(aCaseDo);
        return aCaseDo;
    }

    @Override
    public CaseDo setCreditCardVerify(String caseId, CreditCardVerify creditCardVerify) {
        CaseDo aCaseDo = caseRespository.findByCaseId(caseId);
        aCaseDo.setCreditCardVerify(creditCardVerify);
        caseRespository.save(aCaseDo);
        return aCaseDo;
    }

    @Override
    public CaseDo setCaseStatusReviewing(String caseId) {
        CaseDo aCaseDo = caseRespository.findByCaseId(caseId);
        aCaseDo.review();
        caseRespository.save(aCaseDo);
        return aCaseDo;
    }

    @Override
    public CaseDo reviewCaseSuccess(String caseId) {
        CaseDo aCaseDo = caseRespository.findByCaseId(caseId);
        aCaseDo.completeSuccess();
        caseRespository.save(aCaseDo);
        return aCaseDo;
    }

    @Override
    public CaseDo reviewCaseFailed(String caseId) {
        CaseDo aCaseDo = caseRespository.findByCaseId(caseId);
        aCaseDo.completeFail();
        caseRespository.save(aCaseDo);
        return aCaseDo;
    }
}
