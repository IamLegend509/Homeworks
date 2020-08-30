import java.util.Scanner;
public class InputScanner
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter you name:");
        String name=sc.nextLine();
        System.out.println("Enter your zodiac sign");
        String zodiac= sc.next();
        System.out.println("Enter your weight");
        double weight= sc.nextDouble();
        System.out.println("Enter your lucky number");
        int luckyNum= sc.nextInt();
        System.out.println("Hello"+name+".");
        System.out.println("Your zodiac sign is "+zodiac);
        System.out.println("Your Lucky number is "+ luckyNum);
        System.out.println("Your weight is "+ weight);
    }
}