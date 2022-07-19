package com.redhat.lab.interfaces.adapter.api;

import com.redhat.lab.interfaces.dto.Attachment;
import com.redhat.lab.interfaces.dto.AttachmentCaseMapping;
import com.redhat.lab.interfaces.dto.NewAttachment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
public class AttachmentsApiImpl implements AttachmentsApi {
    @Override
    public ResponseEntity<Attachment> attachmentsAttachmentIdGet(String attachmentId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> attachmentsAttachmentIdPut(String attachmentId, String attachmentId2, String attaKind, String updateTime, MultipartFile content) {
        System.out.println("test");
        return null;
    }

    @Override
    public ResponseEntity<List<AttachmentCaseMapping>> attachmentsListGet(String caseId) {
        return null;
    }

    @Override
    public ResponseEntity<Attachment> attachmentsPost(NewAttachment newAttachment) {
        Attachment attachment = new Attachment();
        attachment.setAttachmentId("x123");
        attachment.setAttaKind(newAttachment.getAttaKind());
        attachment.setContent(newAttachment.getContent());
        attachment.setUpdateTime("1994/06/26T08:35:25Z");

        return new ResponseEntity<>(attachment, HttpStatus.OK);
    }
}
