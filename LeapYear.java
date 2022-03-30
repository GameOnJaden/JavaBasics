import java.util.*;

public class LeapYear{

	public static void main(String[] args) {
		
		int x;

		Scanner sc = new Scanner(System.in);

		System.out.println("Which year you want to check is leap year or not ? ");
		x = sc.nextInt();

		if((x % 400 == 0) || ((x % 4 == 0) && (x % 100 != 0))){

			System.out.println("" + x + " is a leap year.");
		}

		else{
			System.out.println("" + x + " is not a leap year");
		}
	}
}