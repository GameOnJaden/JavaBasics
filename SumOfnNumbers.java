import java.util.*;

public class SumOfnNumbers{

	public static void main(String[] args) {
		
		int x,values, sum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("How many number you want to add ");
		x = sc.nextInt();

		for(int i = 1; i <= x; i++){

			System.out.println("Value " + i + ": " );
			values = sc.nextInt();

			sum = sum + values;
		}

		System.out.println("Total sum is " + sum);
	}
}