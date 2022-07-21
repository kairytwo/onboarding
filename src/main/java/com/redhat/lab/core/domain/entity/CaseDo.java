package com.redhat.lab.core.domain.entity;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class CaseDo {

    @Getter
    private String caseId;

    @Getter
    private String productKind;

    @Getter
    private Date createTime;

    @Getter
    private Date updateTime;

    @Getter
    private Status status;

    @Getter
    private BasicInfoDo basicInfo;

    @Getter
    private List<AttachmentDo> attachmentDoList;

    @Getter
    private CreditCardVerify creditCardVerify;


    public enum Status {
        APPLYING,
        REVIEWING, // 已受理
        COMPLETE_SUCCESS,
        COMPLETE_FAIL
    }

    private CaseDo() {
        attachmentDoList = new ArrayList<>();
    }

    public static CaseDo create(String productKind) {
        CaseDo c = new CaseDo();
        c.caseId = UUID.randomUUID().toString();
        c.productKind = productKind;
        c.createTime = new Date();
        c.status = Status.APPLYING;
        return c;
    }

    public void review() {
        this.status = Status.REVIEWING;
        this.updateTime = new Date();
    }

    public void completeSuccess() {
        this.status = Status.COMPLETE_SUCCESS;
        this.updateTime = new Date();
    }

    public void completeFail() {
        this.status = Status.COMPLETE_FAIL;
        this.updateTime = new Date();
    }

    public void addAttachment(AttachmentDo attachmentDo) {
        this.attachmentDoList.add(attachmentDo);
    }

    public void setBasicInfo(BasicInfoDo basicInfo) {
        this.basicInfo = basicInfo;
    }

    public void setCreditCardVerify(CreditCardVerify creditCardVerify) {
        this.creditCardVerify = creditCardVerify;
    }
}
