import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SumAndAverage {
    @SafeVarargs
    private static <T> void print(T... params) {
        for (Object param : params)
            System.out.print(param);
    }

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int len;
        List<Integer> arr = new ArrayList<>();

        len = in.nextInt();
        for (int i = 0; i < len; i++)
            arr.add(in.nextInt());

        calculateSum(arr);
        try {
            calculateAverage(arr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void calculateSum(List<Integer> arr) {
        int sum = 0;

        for (Integer integer : arr)
            sum += integer;

        print("Array elements sum is: ", sum, '\n');
    }
    private static void calculateAverage(List<Integer> arr) throws Exception {
        if (arr.isEmpty())
            throw new Exception("Array is empty");
        double average = arr.get(0);
        for (int i = 1; i < arr.size(); i++)
             average = average + (arr.get(i) - average) / (i + 1);

        print("Array elements average is: ", average, '\n');
    }
}
