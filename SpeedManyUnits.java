import java.util.Scanner;

public class SpeedManyUnits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the distance in meters:");

        float distance_inp = sc.nextFloat();

        System.out.println("Enter the hour part of the time:");

        int hour = sc.nextInt();

        System.out.println("Enter the minute part of the time taken:");

        int minute = sc.nextInt();

        System.out.println("Enter the second part of the time:");

        int seconds = sc.nextInt();

        int seconds_total = (hour * 3600) + (minute * 60) + seconds;

        float hours_total = (seconds / 3600) + (minute / 60) + hour;

        float distance_km = distance_inp / 1000;

        float distance_mile = distance_inp / 1609;

        System.out.println("The speed in m/s unit is " + distance_inp / seconds_total);

        System.out.println("The speed in km/hr unit is " + distance_km / hours_total);

        System.out.println("The speed in miles/hr unit is " + distance_mile / hours_total);

    }
}
