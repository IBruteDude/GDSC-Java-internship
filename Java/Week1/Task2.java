import java.util.Scanner;

public class Task2 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int num1, num2;
        char op;
        boolean quit = false;

        while (!quit) {
            System.out.println("Enter two numbers: ");
            num1 = input.nextInt();
            num2 = input.nextInt();

            System.out.println("Choose operation: ");
            op = input.next().charAt(0);

            switch (op) {
                case '+':
                    System.out.println("Their sum is: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Their difference is: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Their product is: " + (num1 * num2));
                    break;
                case '/':
                    System.out.println("Their quotient is: " + (num1 / num2));
                    break;
                case 'q':
                    quit = true;
                    break;
                default:
                    System.out.println("Unknown operation");
                    break;
            }
            System.out.println("-----------------------------------------------");
        }
    }
}
