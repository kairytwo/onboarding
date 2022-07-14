package com.redhat.lab.interfaces.adapter.api;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redhat.lab.core.subdomain.entity.BankCodeVo;
import com.redhat.lab.core.subdomain.service.BankCodeService;
import com.redhat.lab.infrastructure.common.api.CallMockService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/")
@CrossOrigin
public class BankCodeController {

	@Resource
	BankCodeService bankCodeService;

	@Resource
	CallMockService mock;

	@ApiOperation(value = "銀行代碼", notes = "", response = BankCodeVo.class, responseContainer = "List", tags = {
			"bank-code-controller", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "OK", response = BankCodeVo.class, responseContainer = "List"),
			@ApiResponse(code = 404, message = "Not Found"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@GetMapping("/	")
	public ResponseEntity<List<BankCodeVo>> index(HttpServletRequest reauest) {
		List<BankCodeVo> list = bankCodeService.all();

		return new ResponseEntity<>(list, HttpStatus.OK);
	}

}
