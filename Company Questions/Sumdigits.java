package CompanyQuestions;
import java.util.Scanner;
public class Sumdigits {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r,sum=0,r1,sum1=0;
		while(n!=0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
        while(sum!=0)
        {
        	r1=sum%10;
        	sum1=sum1+r1;
        	sum=sum/10;
        }
        System.out.println(sum1);
	}

}
