package Chapter9;

/**
 * Project: Java-Advanced
 * Date  : 10/14/2026
 *
 * @author: Phetolo Mokoena
 * Account Prefix:
 * <ul>
 *     <li>Debit:   DB</li>
 *     <li>Savings: SV</li>
 *     <li>Credit:  CR</li>
 *     <li>cheque:  CQ</li>
 *     <li>Loan:    LN</li>
 * </ul>
 * <h3>Exception</h3>
 * <ul>
 *     <li>InsufficientFundsExcepttion: Throen when trying to withdraw more than what is available</li>
 *     <li>IlligalArgumentException: Thrown when trying to deposit or withdrwa negative amount</li>
 * </ul>
 */

enum AccountType{
    DEBIT, SAVINGS, CREDIT, CHEQUES, LOAN
}

public class BankAccount {
    private String accountHolder, accoountnumber;
    private AccountType accountType;
    private double balance;

    //overloaded constructor

    public BankAccount(String accountHolder, String accoountnumber, AccountType accountType, double balance) {
        this.accountHolder = accountHolder;
        this.accoountnumber = accoountnumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    //setters and getters

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public String getAccoountnumber() {
        return accoountnumber;
    }

    public void setAccoountnumber(String accoountnumber) {
        //Provide logic to assign the account prefix
        //Sv-45698743
        String prefix = " ";
        if(getAccountType() == AccountType.CHEQUES ){
            prefix = "CQ-";
        } else if (getAccountType() == AccountType.CREDIT) {
            prefix = "CR-";
        }else if (getAccountType() == AccountType.DEBIT) {
            prefix = "DB-";
        }else if (getAccountType() == AccountType.LOAN) {
            prefix = "LN-";
        }else if (getAccountType() == AccountType.SAVINGS) {
            prefix = "SV-";
        }else {
            prefix = "Inavlid account type boso";
        }
        this.accoountnumber = prefix + accoountnumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountType(AccountType accountType) {

        this.accountType = accountType;
    }
    public void deposit(double amount) throws IllegalArgumentException{
        if (amount <= 0){
            throw new IllegalArgumentException("Cannot deposit negative or zero Amount. [" + amount + "]");
        }
        this.balance += amount;
    }
    public void  withdraw(double amount) throws IllegalArgumentException, InsufficientFundsExceptio{
        if (amount <= 0){
            throw new IllegalArgumentException("Cannot Withdraw negative or zero Amount. [" + amount + "]");
        }
        if(amount > getBalance()){
            throw new InsufficientFundsExceptio("Insufficient Funds...\n Current Balance: " + getBalance()+
                    "\nRequested Amount: " + amount);
        }
        this.balance -= amount;
    }
    public String displayDetails(){
        return  String.format("""
                Account Holder      :   %s
                Account Number      :   %s
                Account Type        :   %s
                Balance             :   %.2f
                """,getAccountHolder(),getAccoountnumber(),getAccountType(),getBalance());
    }

}
