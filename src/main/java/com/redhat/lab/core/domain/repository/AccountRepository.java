package com.redhat.lab.core.domain.repository;

import com.redhat.lab.core.domain.entity.Account;

public interface AccountRepository {

    void save(Account account);
}
