package com.redhat.lab.infrastructure.util;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestClientUtil {
	@Autowired
	RestTemplate restTemplate;

	public <T> T get(String uri, Class<T> responseType, Map header) {

		T result = (T) restTemplate.getForObject(uri, responseType, header);

		return result;
	}

	public <T> T post(String uri, Object request, Class<T> responseType, Map header) {

		T result = (T) restTemplate.postForObject(uri, request, responseType, header);

		return result;
	}
}
