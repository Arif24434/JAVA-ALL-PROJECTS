import jdk.swing.interop.SwingInterOpUtils;

import java.math.BigDecimal;

public class BankAccount {

    private BigDecimal balance;

    public BankAccount () {
       balance =BigDecimal.ZERO;
    }
    public void topUp(BigDecimal amount){
     balance=balance.add(amount);
        System.out.println("After Deposite current balance is :" +balance  );
    }

    public void withDraw(BigDecimal amount){

        balance = balance.subtract(amount);
        System.out.println( "After withDraw current balance is:" + balance);

    }
    public long AccountNumber=454567767;{
        System.out.println("Account Number is:"+AccountNumber);
    }



  }

