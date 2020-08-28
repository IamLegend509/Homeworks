public class ASCII
{
    void display()
    {
        char cha='a', chb='b',chA='A', chB='B';
        int asA,asB,asa,asb;
        asA=(int)chA;
        asB=(int)chB;
        asa=(int)cha;
        asb=(int)chb;
        System.out.println("The ASCII value of Character A is:"+asA);
        System.out.println("The ASCII value of Character B is:"+asB);
        System.out.println("The ASCII value of Character a is:"+asa);
        System.out.println("The ASCII value of Character b is:"+asb);
    }
    public static void main()
    {
        ASCII a= new ASCII();
        a.display();
    }
}