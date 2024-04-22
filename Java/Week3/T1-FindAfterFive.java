import java.util.*;

class FindAfterFive {
    @SafeVarargs
    private static <T> void print(T... params) {
        for (Object param : params)
            System.out.print(param);
    }

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int key, len;
        List<Integer> arr = new ArrayList<>();

        len = in.nextInt();
        for (int i = 0; i < len; i++)
            arr.add(in.nextInt());

        key = in.nextInt();

        for (int i = 0; i < arr.size(); i++)
            if (key == arr.get(i)) {
                if (i < 5)
                    continue;
                print(key, " is found at index ", i);
                break;
            }
    }
}
