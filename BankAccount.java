class BankAccount
{
    private String Name;
    private long AccNum;
    private String AccType;
    private double Balance;
    public BankAccount()
    {
        Name="";
        AccNum=0;AccType="";
        Balance=0;
    }
    public BankAccount(String dname,long an,String at,double bal)
    {
        Name=dname;
        AccNum=an;
        AccType=at;
        Balance=bal;
    }
    void initialize(String dname,long an,String at,double bal)
    {
        Name=dname;
        AccNum=an;
        AccType=at;
        Balance=bal;
    }
    void display()
    {
        System.out.println("Depositor Name"+Name);
        System.out.println("Account Number"+AccNum);
        System.out.println("Account Type"+AccType);
        System.out.println("Balance Amount"+Balance);
    }
    void deposit(double amt)
    {
        Balance+=amt;
    }
    void withdraw(double amt)
    {
        if(amt<=Balance)
           Balance-=amt;
    }
    public static void main(String N,long AN, String AT, double BA)
    {
        BankAccount a=new BankAccount();
        a.initialize(N,AN,AT,BA);
        a.deposit(1680);
        a.display();
        a.withdraw(200000);
        a.display();
    }
}