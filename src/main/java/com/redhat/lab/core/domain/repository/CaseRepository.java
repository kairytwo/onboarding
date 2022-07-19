package com.redhat.lab.core.domain.repository;

import com.redhat.lab.core.domain.entity.Case;

public interface CaseRepository {
    Case findByCaseId(String caseId);

    void save(Case aCase);
}
