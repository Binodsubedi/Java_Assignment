import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to check for prime:");

        int input = sc.nextInt();

        if (input > 3) {
            System.out.println("2 and 3 are initial primes");
        }

        for (int i = 5; i <= input; i++) {

            int half = i / 2;

            for (int j = 2; j <= half; j++) {

                int val_check = i / j;

                Double checker = Double.valueOf(i) / Double.valueOf(j);

                // System.out.println("now:" + checker);

                if (checker == val_check) {

                    break;
                } else if (j == half && checker != val_check) {
                    System.out.println(i);
                }
            }

        }

    }

}