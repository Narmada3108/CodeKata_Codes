import java.util.*;
import java.math.*;
public class Mins{
	public static void main(String[] args)
	{
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the time in HH:MM:SS format(24hours)");
	 String s1=s.next();
	 String s2=s.next();
	 String h1=s1.substring(0,2);
	 int hour1=Integer.valueOf(h1);
	 String h2=s2.substring(0,2);
	 int hour2=Integer.valueOf(h2);
	 int hd=Math.abs(hour1-hour2);	
	 if(hour1>hour2)
	 {
		 hd=24-hour1+hour2;
	 }
	 String m1=s1.substring(3,5);
	 int min1=Integer.valueOf(m1);
	 String m2=s2.substring(3,5);
	 int min2=Integer.valueOf(m2);
	 int md=Math.abs(min1-min2);	 
     int min=0;
	 if(hd!=0)
     {
    	 min+=hd*60;
     }
	 if(md!=0)
     {
    	 min+=md;
     }
	 System.out.println("Total mins:"+min);
	 }
}
