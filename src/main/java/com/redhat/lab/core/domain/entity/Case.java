package com.redhat.lab.core.domain.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Case {

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
    private BasicInfo basicInfo;

    @Getter
    private List<Attachment> attachmentList;


    public enum Status {
        APPLYING,
        REVIEWING, // 已受理
        COMPLETE_SUCCESS,
        COMPLETE_FAIL
    }

    private Case() {
        attachmentList = new ArrayList<>();
    }

    public static Case create(String productKind) {
        Case c = new Case();
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

    public void addAttachment(Attachment attachment) {
        this.attachmentList.add(attachment);
    }

    public void setBasicInfo(BasicInfo basicInfo) {
        this.basicInfo = basicInfo;
    }
}
