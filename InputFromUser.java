import java.util.*; // Scanner class is present inside Util Package 

public class InputFromUser{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Type One line string");
		String c = sc.nextLine();
		System.out.println("One line string value : " + c);

		System.out.println("Enter Integer value");
		int a = sc.nextInt();
		System.out.println("Integer value : " + a);

		System.out.println("Enter Float Value");
		float b = sc.nextFloat();
		System.out.println("FLoat Value : " + b);

		System.out.println("Type One word string ");
		String d = sc.next();
		System.out.println("One word String : " + d);

		

		

	}
}