import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the digits to check if it's Armstrong or not:");

        String num = sc.next();

        int length = num.length();

        int sum_me = 0;

        for (int i = 0; i < length; i++) {

            String current = String.valueOf(num.charAt(i));

            sum_me += Math.pow(Integer.parseInt(current), 3);
        }

        if (sum_me == Integer.valueOf(num)) {
            System.out.println("It's a Armstrong number");
        } else {
            System.out.println("It's not a Armstrong number");
        }

    }
}