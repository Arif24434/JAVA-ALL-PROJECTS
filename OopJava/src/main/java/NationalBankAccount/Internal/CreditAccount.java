package NationalBankAccount.Internal;

import java.math.BigDecimal;

class CreditAccount {
    private final BigDecimal creditLimit;

    CreditAccount(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }
}
