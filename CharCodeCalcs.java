public class CharCodeCalcs
{
    public static void main()
    {
        char l1='A';
        char l2=(char)(l1+1);
        char l3= l2;
        System.out.println("The sequence of letters:"+l1+l2+(++l3));
        System.out.println("The codes for letter are:\n"+l1+":"+(int)l1+"   "+ l2+":"+(int)l2+"   "+l3+":"+(int)l3);
    }
}