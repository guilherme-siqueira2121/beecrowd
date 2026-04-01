import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int largerAB = (A + B + Math.abs(A - B)) / 2;
        int largerABC = (largerAB + C + Math.abs(largerAB - C)) / 2;

        System.out.println(largerABC + " eh o maior");

        scanner.close();
    }
}