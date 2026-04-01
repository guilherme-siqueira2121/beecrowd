import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int totalDistance = scanner.nextInt();
        double fuelConsumption = scanner.nextDouble();
        double fuelAmount = totalDistance / fuelConsumption;

        System.out.printf("%.3f km/l%n", fuelAmount);

        scanner.close();
    }
}