package com.redhat.lab.interfaces.adapter.api;

import com.redhat.lab.core.domain.entity.BasicInfoDo;
import com.redhat.lab.core.domain.entity.CaseDo;
import com.redhat.lab.interfaces.dto.*;
import com.redhat.lab.usecase.OnboardingApplicationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

import static com.redhat.lab.interfaces.converter.Converter.*;

@Controller
public class CaseApiImpl implements CasesApi {

    OnboardingApplicationService onboardingApplicationService;

    public CaseApiImpl(OnboardingApplicationService onboardingApplicationService) {
        this.onboardingApplicationService = onboardingApplicationService;
    }

    @Override
    public ResponseEntity<BasicInfo> casesCaseIdBasicInfoGet(String caseId) {
        return null;
    }

    @Override
    public ResponseEntity<BasicInfo> casesCaseIdBasicInfoPost(String caseId, NewBasicInfo newBasicInfo) {
        BasicInfoDo basicInfoDo = newBasicInfoToBasicInfoDo(caseId, newBasicInfo);
        CaseDo aCaseDo = onboardingApplicationService.writeBasicInfo(caseId, basicInfoDo, newBasicInfo.getCardNo(), newBasicInfo.getCardValidDate());
        BasicInfo basicInfo = caseToBasicInfo(aCaseDo);

        return new ResponseEntity<>(basicInfo, HttpStatus.OK);
    }


    @Override
    public ResponseEntity<Message> casesCaseIdBasicInfoPut(String caseId, BasicInfo basicInfo) {
        return null;
    }

    @Override
    public ResponseEntity<CaseStatus> casesCaseIdStatusGet(String caseId) {
        return null;
    }

    @Override
    public ResponseEntity<Message> casesCaseIdStatusPut(String caseId, CaseStatus caseStatus) {
        Message msg = new Message();
        if (caseStatus.getStatus().equals("success")) {
            onboardingApplicationService.reviewCaseSuccess(caseId);
            msg.setMessage("review success");
        } else if (caseStatus.getStatus().equals("failed")) {
            onboardingApplicationService.reviewCaseFailed(caseId);
            msg.setMessage("review failed");
        }

        ResponseEntity<Message> response = new ResponseEntity<>(msg, HttpStatus.OK);
        return response;
    }

    @Override
    public ResponseEntity<List<ModelCase>> casesGet() {
        return null;
    }

    @Override
    public ResponseEntity<ModelCase> casesPost(NewCase newCase) {
        CaseDo aCaseDo = onboardingApplicationService.raiseCase(newCase.getProductKind());
        ModelCase modelCase = caseToModelCase(aCaseDo);
        return new ResponseEntity(modelCase, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ModelCase> findPetById(String caseId) {
        return null;
    }

}
