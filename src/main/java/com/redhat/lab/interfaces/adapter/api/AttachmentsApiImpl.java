package com.redhat.lab.interfaces.adapter.api;

import com.redhat.lab.core.domain.entity.AttachmentDo;
import com.redhat.lab.interfaces.dto.Attachment;
import com.redhat.lab.interfaces.dto.AttachmentCaseMapping;
import com.redhat.lab.interfaces.dto.NewAttachment;
import com.redhat.lab.usecase.OnboardingApplicationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static com.redhat.lab.interfaces.converter.Converter.attachmentDoToAttachment;

@Controller
public class AttachmentsApiImpl implements AttachmentsApi {

    OnboardingApplicationService onboardingApplicationService;

    public AttachmentsApiImpl(OnboardingApplicationService onboardingApplicationService) {
        this.onboardingApplicationService = onboardingApplicationService;
    }


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
        AttachmentDo attachmentDo = onboardingApplicationService.uploadAttachment(
                newAttachment.getCaseId(),
                AttachmentDo.AttaKind.valueOf(newAttachment.getAttaKind()),
                newAttachment.getContent()
        );

        Attachment attachment = attachmentDoToAttachment(attachmentDo);
        return new ResponseEntity<>(attachment, HttpStatus.OK);
    }

}
