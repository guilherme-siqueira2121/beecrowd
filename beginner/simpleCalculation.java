import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int partCode = scanner.nextInt();
        int quantity = scanner.nextInt();
        double price = scanner.nextDouble();

        int partCode2 = scanner.nextInt();
        int quantity2 = scanner.nextInt();
        double price2 = scanner.nextDouble();

        double total = (quantity * price) + (quantity2 * price2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        scanner.close();
    }
}