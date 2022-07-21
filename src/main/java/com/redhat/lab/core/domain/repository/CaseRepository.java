package com.redhat.lab.core.domain.repository;

import com.redhat.lab.core.domain.entity.CaseDo;

public interface CaseRepository {
    CaseDo findByCaseId(String caseId);

    void save(CaseDo aCaseDo);
}
