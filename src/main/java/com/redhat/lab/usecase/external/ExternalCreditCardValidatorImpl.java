package com.redhat.lab.usecase.external;

import com.redhat.lab.core.domain.entity.CreditCardVerify;
import com.redhat.lab.usecase.ExternalCreditCardValidator;

public class ExternalCreditCardValidatorImpl implements ExternalCreditCardValidator {
    @Override
    public CreditCardVerify validate(String cardNo, String validDate, String phoneNo) {
        String cardNoStr = cardNo.replace("-", "");
        if (cardNoStr.length() != 16) {
            return CreditCardVerify.Failed;
        }

        try {
            Long.parseLong(cardNoStr);
        } catch (NumberFormatException e) {
            return CreditCardVerify.Failed;
        }

        String validDateStr = validDate.replace("/", "");
        if(validDateStr.length() != 6)
            return CreditCardVerify.Failed;

        try {
            Long.parseLong(validDateStr);
        } catch (NumberFormatException e) {
            return CreditCardVerify.Failed;
        }

        if (phoneNo.length() != 10 && phoneNo.startsWith("09"))
            return CreditCardVerify.Failed;
        try {
            Long.parseLong(phoneNo);
        } catch (NumberFormatException e) {
            return CreditCardVerify.Failed;
        }

        return CreditCardVerify.Passed;
    }
}
