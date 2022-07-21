package com.redhat.lab.interfaces.converter;

import com.redhat.lab.core.domain.entity.AttachmentDo;
import com.redhat.lab.core.domain.entity.BasicInfoDo;
import com.redhat.lab.core.domain.entity.CaseDo;
import com.redhat.lab.core.domain.entity.CreditCardVerify;
import com.redhat.lab.interfaces.dto.*;

import java.util.Date;

import static com.redhat.lab.infrastructure.util.DateUtils.dateToIso8601;
import static com.redhat.lab.infrastructure.util.DateUtils.iso8601ToDate;

public class Converter {

    public static ModelCase caseToModelCase(CaseDo aCaseDo) {
        ModelCase modelCase = new ModelCase();
        modelCase.setCaseId(aCaseDo.getCaseId());
        modelCase.setProductKind(aCaseDo.getProductKind());
        modelCase.setCreateTime(dateToIso8601(aCaseDo.getCreateTime()));

        return modelCase;
    }

    public static Attachment attachmentDoToAttachment(AttachmentDo attachmentDo) {
        Attachment attachment = new Attachment();
        attachment.setAttachmentId(attachmentDo.getAttachmentId());
        attachment.setAttaKind(attachmentDo.getAttaKind().name());
        attachment.setContent(attachmentDo.getContent());
        attachment.setUpdateTime(dateToIso8601(attachmentDo.getCreateTime()));
        return attachment;
    }

    public static BasicInfo caseToBasicInfo(CaseDo aCaseDo) {
        BasicInfo basicInfo = new BasicInfo();
        basicInfo.setCaseId(aCaseDo.getCaseId());
        basicInfo.setAddress(aCaseDo.getBasicInfo().getAddress());
        CreditCardVerification creditCardVerification = new CreditCardVerification();
        if (aCaseDo.getCreditCardVerify() == CreditCardVerify.Passed) {
            creditCardVerification.setStatus("Passed");
        } else if (aCaseDo.getCreditCardVerify() == CreditCardVerify.Failed) {
            creditCardVerification.setStatus("Failed");
        }
        creditCardVerification.setVerificationTime(dateToIso8601(new Date()));
        basicInfo.setCreditCardVerification(creditCardVerification);
        basicInfo.setNation(aCaseDo.getBasicInfo().getNation());
        basicInfo.setName(aCaseDo.getBasicInfo().getName());
        basicInfo.setEmail(aCaseDo.getBasicInfo().getEmail());
        basicInfo.setEnglishName(aCaseDo.getBasicInfo().getEnglishName());
        basicInfo.setEarthId(aCaseDo.getBasicInfo().getEarthId());
        basicInfo.setBirthDay(dateToIso8601(aCaseDo.getBasicInfo().getBirthDay()));
        basicInfo.setCreateTime(dateToIso8601(aCaseDo.getBasicInfo().getCreateTime()));
        basicInfo.setCellPhone(aCaseDo.getBasicInfo().getCellPhone());
        basicInfo.setAddress(aCaseDo.getBasicInfo().getAddress());
        return basicInfo;
    }

    public static BasicInfoDo newBasicInfoToBasicInfoDo(String caseId, NewBasicInfo newBasicInfo) {
        BasicInfoDo basicInfoDo = BasicInfoDo.create(caseId,
                newBasicInfo.getAddress(),
                iso8601ToDate(newBasicInfo.getBirthDay()),
                newBasicInfo.getCellPhone(),
                newBasicInfo.getEarthId(),
                newBasicInfo.getEmail(),
                newBasicInfo.getEnglishName(),
                newBasicInfo.getName(),
                newBasicInfo.getNation()
        );
        return basicInfoDo;
    }
}
