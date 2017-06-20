import java.util.Scanner;
public class AlphabetCheck {
	 public static void main(String[] args)
	  {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter a character:");
	    char ch;
	    ch=s.next().charAt(0);
	    if(ch>='A'&& ch<='Z'||ch>='a'&& ch <='z')
	    {
	       System.out.println("The given character "+ ch + " is an alphabet.");
	    }
	    else
	   { 
	     System.out.println("The given character "+ch + " is not an alphabet");   
	   }
	  }
}
