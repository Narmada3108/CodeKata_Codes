import java.util.*;
public class Factorial {
public static void main(String[] args)
{
	int i,num;
	long factorial=1;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number to find its factorial: ");
	num=s.nextInt();
	int x=num;
	while(num!=0)
	{
		factorial*=num;
		num--;
	}
	System.out.println(x +"! is "+factorial);
}
}
