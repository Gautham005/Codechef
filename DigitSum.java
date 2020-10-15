// java is not a coffee. It's more than a coffee
	
import java.util.Scanner;
class DigitSum{
	public static void main(String[] args) {
		int sum,a,r,n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			sum=0;
			a=s.nextInt();
			while(a!=0)
		{
			r=a%10;
			sum+=r;
			a=a/10;
		}
		System.out.println(sum);
		}

	}
}
