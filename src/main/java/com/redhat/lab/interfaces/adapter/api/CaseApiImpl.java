package com.redhat.lab.interfaces.adapter.api;

import com.redhat.lab.infrastructure.common.api.CaseService;
import com.redhat.lab.interfaces.dto.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CaseApiImpl implements CasesApi {

    CaseService caseService;

    @Override
    public ResponseEntity<BasicInfo> casesCaseIdBasicInfoGet(String caseId) {
        return null;
    }

    @Override
    public ResponseEntity<BasicInfo> casesCaseIdBasicInfoPost(String caseId, NewBasicInfo newBasicInfo) {
        BasicInfo basicInfo = new BasicInfo();
        basicInfo.setCaseId(caseId);
        basicInfo.setAddress(newBasicInfo.getAddress());
        basicInfo.setCreateTime("1994/06/26T08:23:21Z");
        basicInfo.setCellPhone(newBasicInfo.getCellPhone());
        basicInfo.setBirthDay(newBasicInfo.getBirthDay());
        basicInfo.setCreditCardVerification(newBasicInfo.getCreditCardVerification());
        basicInfo.setEarthId(newBasicInfo.getEarthId());
        basicInfo.setEmail(newBasicInfo.getEmail());
        basicInfo.setEnglishName(newBasicInfo.getEnglishName());
        basicInfo.setName(newBasicInfo.getName());
        basicInfo.setNation(newBasicInfo.getNation());
        basicInfo.setUpdateTime(null);

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
        return null;
    }

    @Override
    public ResponseEntity<List<ModelCase>> casesGet() {
        return null;
    }

    @Override
    public ResponseEntity<ModelCase> casesPost(NewCase newCase) {
        String productKind = newCase.getProductKind();

        ModelCase modelCase = new ModelCase();
        modelCase.setCaseId("aadd-aads-1231-fasda-123123");
        modelCase.setProductKind(productKind);
        modelCase.setCreateTime("1994/06/26T08:35:25Z");

        return new ResponseEntity(modelCase, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ModelCase> findPetById(String caseId) {
        return null;
    }
}
