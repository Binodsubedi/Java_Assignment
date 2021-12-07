public class Shapes {
    public static void main(String[] args) {

        int space = 4;

        int increment = 1;

        for (int i = 1; i <= 5; i++) {
            System.out.println("*****");
        }

        System.out.println();

        System.out.println("Next shape");

        System.out.println();

        for (int i = 1; i <= 5; i++) {
            if (i == 1 || i == 5) {

                System.out.println("*****");

            } else {
                System.out.println("*   *");
            }

        }

        System.out.println();

        System.out.println("Next shape");

        System.out.println();

        for (int i = 1; i <= 5; i++) {

            int spaceInternal = space;

            int incrementInternal = increment;

            while (spaceInternal > 0) {
                System.out.print(" ");
                spaceInternal--;
            }

            while (incrementInternal > 0) {
                System.out.print("*");
                incrementInternal--;

            }
            System.out.println();

            if (i < 5) {

                space--;
                increment += 2;
            }

        }

        System.out.println();

        System.out.println("Next shape");

        System.out.println();

        for (int i = 1; i <= 5; i++) {

            int spaceInternal = space;

            int incrementInternal = increment;

            while (spaceInternal > 0) {
                System.out.print(" ");
                spaceInternal--;
            }

            while (incrementInternal > 0) {
                System.out.print("*");
                incrementInternal--;

            }
            System.out.println();

            space++;
            increment -= 2;

        }

    }
}
