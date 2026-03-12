import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int employeeNumber = scanner.nextInt();
        int hoursWorked = scanner.nextInt();
        double wage = scanner.nextDouble();
        double result = hoursWorked * wage;

        System.out.println("NUMBER = " + employeeNumber);
        System.out.printf("SALARY = U$ %.2f%n", result);
    }
}

// -