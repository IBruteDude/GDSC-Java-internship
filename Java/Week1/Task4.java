import java.util.Scanner;

public class Task4 {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int weekDay = input.nextInt();

		switch (weekDay) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				break;
		}
	}
}
