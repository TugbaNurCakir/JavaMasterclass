package JavaMasterClassFolders.Constructor.VipAccountExample;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("tugbanur", 555.55, "tugba@nur.com");
    }

    public VipCustomer(String name, String emailAddress){
        this(name, 353454.03, emailAddress);
    }

    public VipCustomer(String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    public String getEmailAddress() {
        return emailAddress;
    }

    
}
