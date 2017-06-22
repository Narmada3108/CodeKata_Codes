import java.util.Scanner;
public class Swap {
public static void main(String[] args)
{
	char t,x,y;
	int i=0,j=1;
	System.out.println("String:");
	Scanner s=new Scanner(System.in);
	String str=s.next();
	int len=str.length();
	char [] c=new char[10];
	char [] odd=new char[10];
	char [] even=new char[10];
	for(i=0,j=0;i<len-1 && j< len;i++,j+=2)
	{
		even[i]=str.charAt(j);
	}
	for(i=0,j=1;i<len-1 && j< len;i++,j+=2)
	{
		odd[i]=str.charAt(j);
	}
	for(i=0,j=0;i<len;i+=2,j++)
	{
		c[i]=odd[j];
		c[i+1]=even[j];
	}
	
	if(len%2==0){}
	else
	{
		c[len-1]=str.charAt(len-1);
	}
	for(i=0;i<(len);i++)
	{
		System.out.print(c[i]);
	}
  }
}
