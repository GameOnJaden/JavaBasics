import java.util.*;

public class PrintnNaturalNumbers{

	public static void main(String[] args) {
		
		int x;

		Scanner sc = new Scanner(System.in);

		System.out.println("How many natural numbers you want to print ");
		x = sc.nextInt();

		System.out.println("First " + x + " natural numbers are : ");

		for(int i = 1; i <= x; i++){

			System.out.print(" " + i);

		}


	}
}