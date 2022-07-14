package com.redhat.lab.core.subdomain.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.redhat.lab.core.subdomain.repository.po.BankCodePo;

@Repository
public interface BankCodeDao extends JpaRepository<BankCodePo, String> {
}
