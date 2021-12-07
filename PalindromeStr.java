import java.util.Scanner;

public class PalindromeStr {

    public static void main(String[] args) {

        System.out.println("Enter the string:");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        for (int i = a.length() - 1; i >= 0; i--) {
            System.out.print(a.charAt(i));
        }

    }
}
