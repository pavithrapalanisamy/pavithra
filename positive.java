package positive;
import java.util.Scanner;
public class positive {

	
	public static void main(String[] args) {
		
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		 n=s.nextInt();
		if(n>0)
		{
			System.out.println("number is positive");
			
		}
		else if(n<0)
		{
			System.out.println("number is negative");
			
		}
		else
		{
			System.out.println("number is zero");
		}

	}

}
