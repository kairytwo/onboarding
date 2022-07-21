package com.redhat.lab.core.domain.entity;

import lombok.Getter;

import java.util.Date;
import java.util.UUID;

public class AttachmentDo {

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

    private AttachmentDo() { }

    public static AttachmentDo create(AttaKind attaKind, String content) {
        AttachmentDo attachmentDo = new AttachmentDo();
        attachmentDo.attachmentId = UUID.randomUUID().toString();
        attachmentDo.attaKind = attaKind;
        attachmentDo.content = content;
        attachmentDo.createTime = new Date();

        return attachmentDo;
    }

    public void reUpload(String content) {
        this.content = content;
        this.updateTime = new Date();
    }
}
