package com.redhat.lab.core.domain.entity;

import lombok.Getter;

import java.util.Date;

public class BasicInfo {
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
    private  creditCardVerify cardVerify;

    private enum creditCardVerify{
        Passed, // 驗證成功
        Failed  // 驗證失敗
    }

    @Getter
    private Date createTime;

    @Getter
    private Date updateTime;

    private BasicInfo() { }

    public static BasicInfo create(String caseId, String address, Date birthDay, String cellPhone, String earthId, String email, String englishName, String name, String nation, creditCardVerify cardVerify){
        BasicInfo basicInfo = new BasicInfo();
        basicInfo.caseId = caseId;
        basicInfo.address = address;
        basicInfo.birthDay = birthDay;
        basicInfo.cellPhone = cellPhone;
        basicInfo.earthId = earthId;
        basicInfo.email = email;
        basicInfo.englishName = englishName;
        basicInfo.name = name;
        basicInfo.nation = nation;
        basicInfo.cardVerify = cardVerify;
        basicInfo.createTime = new Date();
        return  basicInfo;
    }

    public void modify(String address, Date birthDay, String cellPhone, String earthId, String email, String englishName, String name, String nation){
        this.address = address;
        this.birthDay = birthDay;
        this.cellPhone = cellPhone;
        this.earthId = earthId;
        this.email = email;
        this.englishName = englishName;
        this.name = name;
        this.nation = nation;
        this.updateTime = new Date();
    }

}
