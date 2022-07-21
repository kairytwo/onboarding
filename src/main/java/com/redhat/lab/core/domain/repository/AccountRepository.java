package com.redhat.lab.core.domain.repository;

import com.redhat.lab.core.domain.entity.AccountDo;

public interface AccountRepository {

    void save(AccountDo account);
}
