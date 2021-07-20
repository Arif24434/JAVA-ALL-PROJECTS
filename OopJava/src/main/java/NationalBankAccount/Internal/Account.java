package NationalBankAccount.Internal;

import java.math.BigDecimal;

//TODO: implement the method

abstract class Account {
  private final String accountNumber;
  private BigDecimal balance;
  private double percents;

 public Account(String accountNumber) {
  this.accountNumber = accountNumber;
  balance=BigDecimal.ZERO;
  }
  abstract void calculatePercents();

  void topUp(BigDecimal amount){

  }

  BigDecimal withDraw(BigDecimal amount){
  return BigDecimal.ZERO;

  }

    public Account(String accountNumber, BigDecimal balance, double percents) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.percents = percents;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public double getPercents() {
        return percents;
    }

    public void setPercents(double percents) {
        this.percents = percents;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", percents=" + percents +
                '}';
    }
}
