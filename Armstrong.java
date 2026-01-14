import java.util.Scanner;

public class Armstrong {
	
	public static void main(String args[]) {
        int s=0;
        int r;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int temp = n;
		while(n>0)
		{
			r = n%10;
			s = s+(r*r*r);
			n = n/10;
		}
		if(temp==s)
		{
			System.out.println(temp+ " is Armstrong number");
		}
		else
		{
			System.out.println(temp+ " is not Armstrong number");
		}
	}

}
