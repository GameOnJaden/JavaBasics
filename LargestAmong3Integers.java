import java.util.*;

public class LargestAmong3Integers{

	public static void main(String[] args) {
		
		int x, y, z;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 3 Integers you want to compare ");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();

		if(x > y && x > z){

			System.out.println(x + " is the largest integer");

		}
		else if(y > x && y > z){

			System.out.println(y + " is the largest integer");

		}
		else{
			System.out.println(z + " is the largest integer");
		}
	}
}