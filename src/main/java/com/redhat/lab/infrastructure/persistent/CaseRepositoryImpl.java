package com.redhat.lab.infrastructure.persistent;

import com.redhat.lab.core.domain.entity.Case;
import com.redhat.lab.core.domain.repository.CaseRepository;

import java.util.HashMap;

public class CaseRepositoryImpl implements CaseRepository {
    HashMap<String, Case> map = new HashMap<>();

    @Override
    public Case findByCaseId(String caseId) {
        return map.get(caseId);
    }

    @Override
    public void save(Case aCase) {
        map.put(aCase.getCaseId(), aCase);
    }
}
