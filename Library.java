public class Library
{
    int acc_num;
    String title;
    String author;
    
    void input(int a, String t, String au)
    {
        acc_num = a;
        title = t;
        author = au;
    }
    void compute(int lateDays)
    {
        final int fine = 2;
        int calc = fine*lateDays;
        System.out.println("The fine for late return of book is:" + calc);
    }
    void display()
    {
        System.out.println("Accession Number \t"+ "Title \t    "+"Author");
        System.out.println(acc_num + "\t    " + title + "\t  " + author);
    }
    public static void main(int acc,String ti,String aut)
    {
        Library obj = new Library();
        obj.input(acc,ti,aut);
        obj.compute(23);
        obj.display();
    }
}