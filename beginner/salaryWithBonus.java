import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double wage = scanner.nextDouble();
        double totalSales = scanner.nextDouble();
        double commission = totalSales * 0.15;
        double totalToReceive = wage + commission;
        
        System.out.printf("TOTAL = R$ %.2f%n", totalToReceive);
    }
}

// -