package com.redhat.lab.core.subdomain.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.redhat.lab.core.subdomain.entity.BankCodeVo;
import com.redhat.lab.core.subdomain.repository.BankCodeDao;

@Service
public class BankCodeServiceImp implements BankCodeService {

	@Resource
	BankCodeDao bankCodeDao;

	@Override
	public List<BankCodeVo> all() {
		List<BankCodeVo> list = new ArrayList<>();
		bankCodeDao.findAll().forEach(bankCode -> {
			list.add(new BankCodeVo(bankCode.getCode(), bankCode.getBankName()));
		});
		return list;
	}

}
