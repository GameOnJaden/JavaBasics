import java.util.*;

public class SwapWithout3rdVariable{

	public static void main(String[] args) {
		
		int x, y;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 numbers you want to swap ");
		x = sc.nextInt();
		y = sc.nextInt();

		System.out.println("Numbers before swap " + "x :" + x + " y :" + y);

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("Numbers after swap " + "x :" + x + " y :" + y);

	}
}