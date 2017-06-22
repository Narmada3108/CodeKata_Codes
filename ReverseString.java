import java.util.*;
public class ReverseString {
	public static void main(String[] args)
	{
		int i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String myString=s.next();
		int len=myString.length();
		System.out.println("Reversed String:"+"\n");
		for(i=len-1;i>=0;i--)
		{
			System.out.print(myString.charAt(i));
		}
	
	}
}
