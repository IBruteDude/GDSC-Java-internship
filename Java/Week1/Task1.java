import java.util.Scanner;

public class Task1
{
    static Scanner inputScanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        int age;
        double buildingHeight;
        boolean raining;
        String cityname;

        System.out.println("What's your age?");
        age = inputScanner.nextInt();

        System.out.println("What's the building height?");
        buildingHeight = inputScanner.nextDouble();

        System.out.println("Is it raining?");
        raining = inputScanner.nextBoolean();

        System.out.println("What the name of your city?");
        cityname = inputScanner.next();

        System.out.printf(
            "Your age is: %d%n" +
            "The building height is: %.2f%n" + 
            "Raining reported: " + (raining ? "true" : "false") + "%n" +
            "City name: " + cityname,
            age, buildingHeight, cityname
        );
    }
}
