import java.util.Scanner;
public class Vowel_Consonant {
	 public static void main(String[] args)
	  {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter a character:");
	    char ch;
	    ch=s.next().charAt(0);
	    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	    {
	       System.out.println("The given character "+ ch + " is a vowel.");
	    }
	    else
	   { 
	     System.out.println("The given character "+ch + " is a Consonant");   
	   }
	  }
}
