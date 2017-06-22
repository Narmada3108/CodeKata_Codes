import java.util.Scanner;
public class Roman {
	public static void main(String[] args)
	{
		int num=0;
	    Scanner s = new Scanner(System.in);
	    System.out.print("Please enter Roman Symbol:");
	    String roman = s.next();
        int len=roman.length();
        roman=roman.toUpperCase();
        for(int i=0;i<len;i++)
        {
        	if(roman.charAt(i)=='M')
        	{
        		num+=1000;
        	}
        	if(roman.charAt(i)=='D')
        	{
        		num+=500;
        	}
        	if(roman.charAt(i)=='C')
        	{
        		num+=100;
        	}
        	if(roman.charAt(i)=='L')
        	{
        		if((i-1)!=-1 && roman.charAt(i-1)=='X' )
            	{
            		num=num+50-20;
            	}
        		else
        		{
        			num=num+50;
        		}
        	}
        	if(roman.charAt(i)=='X')
        	{
        		if((i-1)!=-1 && roman.charAt(i-1)=='I' )
            	{
            		num=num+10-2;
            	}
        		else
        		{
        			num=num+10;
        		}
        	}
        	if(roman.charAt(i)=='V')
        	{
        		if( (i-1)!=-1 && roman.charAt(i-1)=='I' )
            	{
            		num=num+5-2;
            	}
        		else
        		{
        			num=num+5;
        		}
        	}
        	if(roman.charAt(i)=='I')
        	{
        		num+=1;
        	}
        }
        System.out.println(num);
	}
}
