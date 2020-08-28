import java.util.Scanner;
public class input
{
    public void sumCubes()
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int num1 = inp.nextInt();
        System.out.print("Enter number 2:");
        int num2 = inp.nextInt();
        System.out.print("Enter number 3:");
        int num3 = inp.nextInt();
        int sum = (num1*num1*num1)+(num2*num2*num2)+(num3*num3*num3);
        System.out.println(num1 +"  " + num2 +"  "+ num3);
        System.out.println(sum);
    }
    public static void main()
    {
        input obj= new input();
        obj.sumCubes();
    }
}