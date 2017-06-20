import java.util.Scanner;
public class LargestNumber {
 public static void main(String [] args)
 {
 Scanner s=new Scanner(System.in);
 System.out.print("Enter the 1st number:");
 int number1=s.nextInt();
 System.out.print("Enter the 2nd number:");
 int number2=s.nextInt();
 System.out.print("Enter the 3rd number:");
 int number3=s.nextInt();
 int lar=(number1 > number2) ?((number1>number3)? number1 :number3): ((number2>number3)? number2 :number3);
 System.out.print("The largest number is: " +lar);
 }
}
