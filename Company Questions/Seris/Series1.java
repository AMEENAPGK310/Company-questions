package Seris;
import java.util.Scanner;
public class Series1 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=11;
		for(int i=0;i<n;i++)
		{
			System.out.printf("%d ",a*a);
			a=a+4;
		}
		

	}

}
