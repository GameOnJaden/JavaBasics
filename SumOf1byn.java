import java.util.*;
public class SumOf1byn{

	public static void main(String[] args) {
		
		int n;
		float i,sum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of n : ");
		n = sc.nextInt();

		for(i=1;i<=n;i++){

			sum = sum + 1/i;
		}

		System.out.println("Sum of " + n + " series is :" + sum);
	}
}