import java.util.Scanner;
public class Number
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the number:");
    int number;
    number=s.nextInt();
    if(number>0)
    {
       System.out.println("The given number "+ number + " is a positive.");
    }
    else if(number < 0)
    {
       System.out.println("The given number "+number + " is a negative.");
    }
    else
   { 
     System.out.println("The given number "+number + " is Zero");   
   }
  }
}
