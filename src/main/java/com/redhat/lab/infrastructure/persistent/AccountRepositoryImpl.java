package com.redhat.lab.infrastructure.persistent;

import com.redhat.lab.core.domain.entity.AccountDo;
import com.redhat.lab.core.domain.repository.AccountRepository;

import java.util.HashMap;

public class AccountRepositoryImpl implements AccountRepository {

    HashMap<String, AccountDo> map = new HashMap<>();

    @Override
    public void save(AccountDo account) {
        map.put(account.getAccountId(), account);
    }
}
