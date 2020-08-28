class temprature
{
    double temp;
    public temprature()
    {
        temp=92;
    }
    public temprature(double t)
    {
      temp=t;  
    } 
    public double convert()
    {
        double cel=(5.0/9)*(temp-32);
        return cel;
    }
    public double getTemp()
    {
        return temp;
    }
}
public class ImplementTemprature
{
    public static void main()
    {
        temprature dayTemp=new temprature(94);
        System.out.println("The temprature in farenheit is:"+ dayTemp.getTemp());
        System.out.println("The temprature in celcius is:"+ dayTemp.convert());
        temprature dTemp=new temprature();
        System.out.println("Other temprature in farenheit is:"+ dTemp.getTemp());
        System.out.println("Other temprature in celcius is:"+ dTemp.convert());
    }
}