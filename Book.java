class Book
{
    String code, title;
    double price;
    Book(String bookcode,String t,double pr)
    {
        code = bookcode;
        title= t; 
        price= pr;
    }
    Book(double prl,String bookcode,String ti)
    {
        code = bookcode;
        title= ti; 
        price= prl;
    }
    Book(String tt,double pri,String bookcode)
    {
        code = bookcode;
        title= tt; 
        price= pri;
    }
    String getCode()
    {
        return code;
    }
    String getTitle()
    {
        return title;
    }
    double getPrice()
    {
        return price;
    }
    /*public static void main()
    {
        Book book1= new Book("sci200","A Place",680.00);
        Book book2= new Book("adv109","Run!",400.00);
        Book book3= new Book("Fict001","What!",290.00);
        System.out.println("Book1" + "Code:" + book1.getCode() + " Title:" + book1.getTitle() + "Price"+ book1.getPrice());
        System.out.println("Book2" + "Code:" + book2.getCode() + " Title:" + book2.getTitle() + "Price"+ book2.getPrice());
        System.out.println("Book3" + "Code:" + book3.getCode() + " Title:" + book3.getTitle() + "Price"+ book3.getPrice());
    }*/
}
class BookStore
{
    public static void main()
    {
        Book book1= new Book("sci200","A Place",680.00);
        Book book2= new Book("adv109","Run!",400.00);
        Book book3= new Book("Fict001","What!",290.00);
        System.out.println("Book1" + "Code:" + book1.getCode() + " Title:" + book1.getTitle() + "Price"+ book1.getPrice());
        System.out.println("Book2" + "Code:" + book2.getCode() + " Title:" + book2.getTitle() + "Price"+ book2.getPrice());
        System.out.println("Book3" + "Code:" + book3.getCode() + " Title:" + book3.getTitle() + "Price"+ book3.getPrice());
    }
}