import java.util.Scanner;

public class MuchoDineroScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 20000.00;
        double amount;

        System.out.println("Positive = deposit, negative = withdrawal, 0 = stop");
        do {
            System.out.print("Enter amount: ");
            amount = sc.nextDouble();

            if (amount == 0) {
                break;
            }

            if (amount < 0 && balance + amount < 0) {
                System.out.println("INSUFFICIENT FUNDS!");
            } else {
                balance += amount;
            }
            System.out.printf("Outstanding balance: P%.2f%n", balance);
        } while (amount != 0);
    }
}

