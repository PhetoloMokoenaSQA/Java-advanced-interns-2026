package Chapter9;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Project: Java-Advanced
 * Date  : 10/14/2026
 *
 * @author: Phetolo Mokoena
 */
public class BankAccountTest {
    BankAccount objAcc;
    @BeforeEach
    void setUpAccount(){
        objAcc = new  BankAccount("Jessica jones", "69457821", AccountType.CHEQUES, 15000);
    }
    @Test
    void tesDeposit(){
        //Arrange
        double amountToDeposit = 600;
        double expectedBalance = 15600;

        //Actual
        objAcc.deposit(amountToDeposit);
        double actualBalance = objAcc.getBalance();

        //Assert
        assertEquals(expectedBalance,actualBalance);
    }
    @Test
    void testInvalidDeposit(){
          assertThrows(IllegalArgumentException.class,()-> objAcc.deposit(-500));
    }
    @Test
    void testWithdraw(){
        double amountToWithdraw = 1500;
        double expectedBalance = 13500;
        double actualbalance ;
        //Actual
        try {
            objAcc.withdraw(amountToWithdraw);
            actualbalance = objAcc.getBalance();
            assertEquals(expectedBalance, actualbalance);
        }catch (InsufficientFundsExceptio ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Test
    void testInvalidWithdrawalNegativeAmount(){
        assertThrows(IllegalArgumentException.class,
                ()-> objAcc.withdraw(-100));
    }

    @Test
    void tesWithdrawInsufficientFunds(){
        double amountToWithdraw = objAcc.getBalance();
        assertThrows(InsufficientFundsExceptio.class,
                ()-> objAcc.withdraw(480000));
    }
    @AfterEach
    void getAccountDetails(){
        System.err.println(objAcc.displayDetails());
    }
}
