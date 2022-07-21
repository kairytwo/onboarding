package com.redhat.lab.infrastructure.persistent;

import com.redhat.lab.core.domain.entity.CaseDo;
import com.redhat.lab.core.domain.repository.CaseRepository;

import java.util.HashMap;

public class CaseRepositoryImpl implements CaseRepository {
    HashMap<String, CaseDo> map = new HashMap<>();

    @Override
    public CaseDo findByCaseId(String caseId) {
        return map.get(caseId);
    }

    @Override
    public void save(CaseDo aCaseDo) {
        map.put(aCaseDo.getCaseId(), aCaseDo);
    }
}
