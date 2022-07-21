package com.redhat.lab.core.domain.entity;

import lombok.Getter;

import java.util.Date;

public class BasicInfoDo {
    @Getter
    private String caseId;

    @Getter
    private String address;

    @Getter
    private Date birthDay;

    @Getter
    private String cellPhone;

    @Getter
    private String earthId;

    @Getter
    private String email;

    @Getter
    private String englishName;

    @Getter
    private String name;

    @Getter
    private String nation;

    @Getter
    private Date createTime;

    private BasicInfoDo() { }

    public static BasicInfoDo create(String caseId, String address, Date birthDay, String cellPhone, String earthId, String email, String englishName, String name, String nation){
        BasicInfoDo basicInfo = new BasicInfoDo();
        basicInfo.caseId = caseId;
        basicInfo.address = address;
        basicInfo.birthDay = birthDay;
        basicInfo.cellPhone = cellPhone;
        basicInfo.earthId = earthId;
        basicInfo.email = email;
        basicInfo.englishName = englishName;
        basicInfo.name = name;
        basicInfo.nation = nation;
        basicInfo.createTime = new Date();
        return  basicInfo;
    }
}
