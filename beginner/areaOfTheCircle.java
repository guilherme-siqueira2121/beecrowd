import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double n = 3.14159;
        double raio = scanner.nextDouble();
        double result = (raio * raio) * n;

        System.out.printf("A=%.4f%n", result);

        scanner.close();
    }
}

// -