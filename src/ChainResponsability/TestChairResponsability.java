package ChainResponsability;

import java.util.Scanner;

public class TestChairResponsability {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.println(
                        "Please enter amount to withdraw: ");
                int amount = scanner.nextInt();

                if (isValid(amount)) {
                    Withdrawal.withdraw(new CurrentBalance(amount));
                }
            } while (true);
        }
    }

    private static boolean isValid(int amount) {

        if (amount <= 0) {
            System.out.println("Invalid amount. Try again!");
            return false;

        } else if (amount > 2000) {
            System.out.println("Daily withdrawal limit is 2000$. Try again!");
                     return false;

        } else if (amount % 10 != 0) {
            System.out.println("Amount must be mutiple of 10, Try again!");
            return false;

        }
        return true;
    }
}
