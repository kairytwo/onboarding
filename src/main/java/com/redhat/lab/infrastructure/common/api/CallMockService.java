package com.redhat.lab.infrastructure.common.api;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redhat.lab.infrastructure.util.RestClientUtil;

@Service
public class CallMockService {

	@Autowired
	RestClientUtil restClient;

	public void callMock() {
		String s = restClient.get("http://localhost:3000/users", String.class, new HashMap());

	}
}
