import java.util.*;
public class ReverseInteger {
	public static void main(String[] args)
	{
		int temp=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an integer:");
		int num=s.nextInt();
		while(num!=0)
		{
			temp=(temp*10)+(num%10);
			num=num/10;
		}
		System.out.print("Reversed Integer : "+temp);
	}
}
