package studentdetails;

import java.util.Scanner;
public class Product1 {
Scanner s=new Scanner(System.in);

    String pname;
    int price;
    int quantity;
    static String d="Welcome to IMS";

void input()
{ 
	 System.out.println("Welcome to IMS");
     System.out.println("Enter the product name=");
      pname=s.next();
     System.out.println("Enter the price=");
      price=s.nextInt();
     System.out.println("Enter the quantity=");
      quantity=s.nextInt();
}

void display()
{
     System.out.println("Name of product ="+pname);
     System.out.println("Price ="+price);
     System.out.println("Quantity ="+quantity);

}

void calculate()
{
       if(price>3000)
      {
         System.out.println("Getting 10% discount");
      }

       else
      {
         System.out.println("getting 9% discount");
      }
}
    public static void main(String[] args)
  {
    Product1 p=new Product1();
    p.input();
    p.display();
    p.calculate();

}


}