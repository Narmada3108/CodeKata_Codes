import java.util.Scanner;
public class sum2 {
	 public static void main(String[] args)
	 {
		 int end_num,sum=0;
		 System.out.print("Enter the number upto which the sum should be found:");
		 Scanner s=new Scanner(System.in);
		 end_num=s.nextInt();
		 sum=(end_num*(end_num+1))/2;
     System.out.println("Sum: "+ sum);
   }
}
