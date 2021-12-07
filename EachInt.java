import java.util.Scanner;

public class EachInt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number:");

        int inputVal = sc.nextInt();

        Boolean on = true;

        int initial = 10;

        // int lenVal = 1;

        int sumMe = 0;

        while (on) {

            double check = inputVal / initial;

            if (Math.floor(check) < 10) {

                while (on) {

                    int val = inputVal / initial;

                    sumMe += val;

                    inputVal -= val * initial;

                    System.out.println("Digit:" + val);

                    initial /= 10;

                    if (initial == 1) {

                        System.out.println("Digit:" + inputVal % 10);

                        sumMe += inputVal % 10;

                        on = false;
                    }

                }

            } else {

                initial *= 10;
                // 123lenVal++;

            }

        }

        System.out.println("Sum is:" + sumMe);

    }

}
