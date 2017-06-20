import java.util.Scanner;
public class Leap {
	public static void main(String[] args)
	 {
		Scanner s=new Scanner(System.in);
	    System.out.print("Enter the yaer to check if it is leap or not:");
	    int year;
	    year=s.nextInt();
	     if(year%400==0)
	     {
	       System.out.println(year + " is a Leap Year");
	     }
	     else if(year%4 ==0 && year%100!=0)
	     {
	    	 System.out.println(year + " is a Leap Year");
	     }
	     else
	     {
	    	 System.out.println(year + " is not a Leap Year");
	     }
	   
	 }
}
