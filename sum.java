import java.util.Scanner;
public class sum {
	 public static void main(String[] args)
	 {
		 int end_num,sum=0;
		 System.out.print("Enter the number upto which the sum should be found:");
		 Scanner s=new Scanner(System.in);
		 end_num=s.nextInt();
		 for(int i=1;i<=end_num;i++)
		 {
			 sum+=i;
		 }
     System.out.println("Sum: "+ sum);
   }
}
