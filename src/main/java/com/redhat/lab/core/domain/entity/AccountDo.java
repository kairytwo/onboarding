package com.redhat.lab.core.domain.entity;

import lombok.Getter;

import java.util.Date;
import java.util.UUID;

public class AccountDo {
    @Getter
    private  String earthId;

    @Getter
    private  String password;

    @Getter
    private  String userId;

    @Getter
    private  String accountId;

    @Getter
    private Date createTime;

    @Getter
    private Date updateTime;

    private AccountDo() { }

    public static AccountDo create(String earthId, String password, String userId){
        AccountDo account = new AccountDo();
        account.accountId = UUID.randomUUID().toString();
        account.earthId = earthId;
        account.password = password;
        account.userId = userId;
        account.createTime = new Date();
        return  account;
    }

    public void changePassword(String password){
        this.password = password;
        this.updateTime = new Date();
    }
}
