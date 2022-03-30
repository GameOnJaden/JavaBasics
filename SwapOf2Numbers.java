import java.util.*;

public class SwapOf2Numbers{

	public static void main(String[] args) {
		
		int x,y,temp=0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 numbers you want to swap ");
		x = sc.nextInt();
		y = sc.nextInt();

		System.out.println("Numbers before swap " + "x :" + x + " y :" + y);

		temp = x;
		x = y;
		y = temp;

		System.out.println("Numbers after swap " + "x :" + x + " y :" + y);

	}
}