import java.util.*;

abstract class Book 
{
    String title;
    String author;
    
    Book(String title, String author) 
    {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}
class MyBook extends Book
{
    String t,a; int p; 
    MyBook(String t,String a,int p)
    {
        super(t,a);
        this.t=t;
        this.a=a;
        this.p=p; 
    }
    void display()
    {
        System.out.println("Title: "+t);
        System.out.println("Author: "+a);
        System.out.println("Price: "+p);
    }
}

public class Solution 
{
   
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
