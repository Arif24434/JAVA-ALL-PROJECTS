package NationalBankAccount.Internal;
import java.math.BigDecimal;
import java.util.List;
import java.math.BigDecimal;

// TODO: Finish Implementation of the method.
 public class Bank {

  private final String name;
  private final List <Account> accounts;

  public Bank(String name, List<Account> accounts) {
   this.name = name;
   this.accounts = accounts;
  }

  public void createAccount(){

  }
  public void topUpAccount (String accountNumber, BigDecimal amount){


  }
  public BigDecimal withdrawAccount(String aaacountNumber, BigDecimal amount){
   return BigDecimal.ZERO;
  }
  public void calculatePercents(){

  }


}
