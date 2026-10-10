import java.util.Scanner;

public class HighestLowestScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double highest = 0, lowest = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            double num = sc.nextDouble();

            if (i == 1) {
                highest = num;
                lowest = num;
            } else {
                if (num > highest) highest = num;
                if (num < lowest) lowest = num;
            }
        }

        System.out.println("Highest number: " + highest);
        System.out.println("Lowest number: " + lowest);
    }
}