package JavaMasterClassFolders.Constructor.Examples.BankAccount;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String emailAddress;
    private int phoneNumber;

    public void deposit(double money){
        this.balance += money;
    }

    public void withdraw(double money) throws Exception{
        if(this.balance-money<0){
           System.out.println("Your balance is not enough.");
        }
        else{
            this.balance -= money;
        }
    }


    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
}
