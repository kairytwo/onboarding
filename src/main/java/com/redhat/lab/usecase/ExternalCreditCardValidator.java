package com.redhat.lab.usecase;

import com.redhat.lab.core.domain.entity.BasicInfoDo;
import com.redhat.lab.core.domain.entity.CreditCardVerify;
import com.redhat.lab.interfaces.dto.CreditCardVerification;

public interface ExternalCreditCardValidator {
    CreditCardVerify validate(String cardNo, String validDate, String phoneNo);
}
