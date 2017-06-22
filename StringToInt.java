import java.util.*;
public class StringToInt {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an string:");
		String str=s.next();
		int len=str.length();
		for(int i=0;i<len;i++)
		{
		  int xx=Integer.valueOf(str.charAt(i));
		  System.out.print(xx+" ");
		}
	}

}
