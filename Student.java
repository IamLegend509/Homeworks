import java.util.Scanner;
public class Student
{
    String name;
    int age;
    int m1, m2, m3;
    int maximum;
    double average;
    void Student(String n, int a, int marks1, int marks2, int marks3, int max, double avg)
    {
        name = n;
        age = a;
        m1 = marks1;
        m2 = marks2;
        m3 = marks3;
        maximum = max;
        average = avg;
    }
    void accept()
    {
        Scanner k= new Scanner(System.in);
        System.out.print("Enter name: ");
        name = k.next();
        System.out.print("Enter age: ");
        age = k.nextInt();
        System.out.print("Enter marks1: ");
        m1 = k.nextInt();
        System.out.print("Enter marks2: ");
        m2 = k.nextInt();
        System.out.print("Enter marks3: ");
        m3 = k.nextInt();
    }
    void compute()
    {
        average = (m1 + m2 + m3) / 3.0;
        maximum = Math.max(m1, (Math.max(m2, m3)));
    }
    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks1 " + m1);
        System.out.println("Marks2 " + m2);
        System.out.println("Marks3 " + m3);
        System.out.println("Maximum: " + maximum);
        System.out.println("Average: " + average);
    }
    public static void main(String[] args)
     {
        Student s = new Student();
        s.accept();
        s.compute();
        s.display();
    }
}