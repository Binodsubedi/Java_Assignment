import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you weight in kg:");

        float weight = sc.nextFloat();

        System.out.println("Enter you height in meters:");

        float height = sc.nextFloat();

        System.out.printf("your body mass index is %.2f", weight / Math.pow(height, 2));
    }
}
