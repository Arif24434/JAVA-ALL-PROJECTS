import java.math.BigDecimal;

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.topUp(BigDecimal.valueOf(120));
        account.withDraw(BigDecimal.valueOf(75));
        account.withDraw(BigDecimal.valueOf(20));




    }

}
