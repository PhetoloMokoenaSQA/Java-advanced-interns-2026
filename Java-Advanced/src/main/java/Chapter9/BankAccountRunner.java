package Chapter9;

/**
 * Project: Java-Advanced
 * Date  : 10/14/2026
 *
 * @author: Phetolo Mokoena
 */
public class BankAccountRunner {
    static void main(String[] args) {
       try {

           BankAccount objAcc = new BankAccount("Jessica jones", "69457821", AccountType.CHEQUES, 15048);

           objAcc.deposit(500);
           objAcc.withdraw(1000);
           System.out.println(objAcc.displayDetails());
       }catch (InsufficientFundsExceptio | IllegalArgumentException ex){
           System.err.println(ex.getMessage());
       }
    }
}
