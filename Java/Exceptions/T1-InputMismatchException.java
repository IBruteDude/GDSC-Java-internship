import java.util.Scanner;
import java.util.InputMismatchException;

class InputMismatch {
    @SafeVarargs
    private static <T> void print(T... params) {
        for (Object param : params)
            System.out.print(param);
    }

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = 0, num2 = 0;
        boolean validInput = false;

        print("Input first number: ");
        while (!validInput) {
            try {
                num1 = in.nextInt();
                validInput = true;
            } catch (InputMismatchException ignored) {
                String previousFalseInput = in.next();
                print("Invalid input, try again: ");
            }
        }
        validInput = false;
        print("Input second number: ");
        while (!validInput) {
            try {
                num2 = in.nextInt();
                validInput = true;
            } catch (InputMismatchException ignored) {
                String previousFalseInput = in.next();
                print("Invalid input, try again: ");
            }
        }
        print(num1 + num2);
    }
}
