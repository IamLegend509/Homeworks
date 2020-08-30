public class P6
{
    void DisplayGrade(String name,double percent)
    {
        System.out.println("Student Name"+name);
        System.out.println("Percentage marks obtained"+ percent);
        if (percent>=80 && percent<100)
            System.out.println("A");
        else if(percent>=60 && percent<80)
            System.out.println("B");
        else if(percent>=50 && percent<60)
            System.out.println("C");
        else
            System.out.println("D");
    }
    public static void main(String n,double per)
    {
        P6 a= new P6();
        a.DisplayGrade(n,per);
    }
}