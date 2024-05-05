import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

class CountWord {
    @SafeVarargs
    private static <T> void print(T... params) {
        for (Object param : params)
            System.out.print(param);
    }

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            String path = System.getProperty("user.dir") + "/Java/Exceptions/Lincoln.txt";
            Scanner fileInput = new Scanner(new FileInputStream(path));
            String input;
            int wordCount = 0;

            while (fileInput.hasNext()) {
                input = fileInput.next();
                wordCount++;
            }
            print("Word count in Lincoln.txt is: ", wordCount);
        } catch (FileNotFoundException e) {
            print(e.getMessage());
        }
    }
}
