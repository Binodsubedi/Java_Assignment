import java.util.InputMismatchException;
import java.util.Scanner;

public class Order {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter the first number:");

            int first = sc.nextInt();

            System.out.println("Please enter the second number:");

            int second = sc.nextInt();

            System.out.println("Enter your last number please:");

            int third = sc.nextInt();

            if (first > second && second > third) {

                System.out.println("It's a descending order");
            } else if (first < second && second < third) {
                System.out.println("It's a ascending order");
            } else {
                System.out.println("There is not much of a order");
            }
        } catch (InputMismatchException e) {

            System.out.println("There's an type error");

        }

    }
}
