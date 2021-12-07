import java.util.InputMismatchException;
import java.util.Scanner;

public class SignificantFigure {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter the first number:");

            float first = sc.nextFloat() * 100;

            System.out.println("Enter the second number:");

            float second = sc.nextFloat() * 100;

            if (Math.floor(first) == Math.floor(second)) {

                System.out.println("They are same");
            } else {
                System.out.println("They are not so alike");
            }

        } catch (InputMismatchException e) {
            System.out.println("The input format is wrong");
        }

    }
}
