import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        // Print first 'a' odd numbers
        for (int i = 1; i <= a; i++) {
            int oddNumber = 2 * i - 1;
            System.out.print(oddNumber);

            // Print comma except after last number
            if (i < a) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}