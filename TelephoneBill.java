public class TelephoneBill
{
    double n;
    void calc(double c)
    {
        n=c;
        double bill;
        if (n<=100)
        {
            bill=100;
        }
        else if(n>100 && n<=150)
        {
            bill=100+(n*2);
        }
        else
        {
            bill=200+(n*2.5);
        }
        System.out.println("Your bill is: Rupees"+bill);
    }
    public static void main(double NumCalls)
    {
        TelephoneBill o= new TelephoneBill();
        o.calc(NumCalls);
    }
}