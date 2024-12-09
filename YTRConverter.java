import java.util.Scanner;

public class YTRConverter {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91; // The value of a constant cannot be changed.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount in Chinese Yuan: ");
        int yuan = scanner.nextInt();

        double roubles = ROUBLES_PER_YUAN * yuan;

        System.out.printf("Amount in Russian rubles: %.2f\n", roubles);
    }
}