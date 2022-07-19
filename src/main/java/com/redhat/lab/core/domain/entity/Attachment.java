package com.redhat.lab.core.domain.entity;

import lombok.Getter;

import java.util.Date;
import java.util.UUID;

public class Attachment {

    @Getter
    private String attachmentId;

    @Getter
    private AttaKind attaKind;

    @Getter
    private String content;

    @Getter
    private Date createTime;

    @Getter
    private Date updateTime;

    public enum AttaKind {
        ID_POSITIVE, // 身份證正面
        ID_NEGATIVE, // 身份證反面
        HEALTH // 健保卡
    }

    private Attachment() { }

    public static Attachment create(AttaKind attaKind, String content) {
        Attachment attachment = new Attachment();
        attachment.attachmentId = UUID.randomUUID().toString();
        attachment.attaKind = attaKind;
        attachment.content = content;
        attachment.createTime = new Date();

        return attachment;
    }

    public void reUpload(String content) {
        this.content = content;
        this.updateTime = new Date();
    }
}
