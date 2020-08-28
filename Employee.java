import java.util.Scanner;
class Employee
{
    int pan;
    String name;
    double taxincome,tax;
    void input(int p, String n, double ti,double t)
    {
        pan=p;
        name=n;
        taxincome=ti;
        tax=t;
    }
    void Calc()
    {
        if(taxincome<=100000)
           tax=0.0;
        else if(taxincome>100000 && taxincome<=150000)
           tax=10*(taxincome-100000)/100;
        else if(taxincome>150000 && taxincome<=250000)
           tax=5000+ 20*(taxincome-150000)/100;
        else
           tax= 25000+ 30*(taxincome-250000)/100;
    }
    void Display()
    {
        System.out.println("Pan Number \t Name \t Tax-income \t Tax");
        System.out.println(pan+"\t"+name+"\t"+taxincome+"\t"+tax);
    }
    public static void main(int P, String N, double TI,double T)
    {
        Employee a= new Employee();
        a.input(P,N,TI,T);
        a.Calc();
        a.Display();
    }
}