import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        int count;

        // Decide how many odd numbers to print
        if (a % 2 == 0) {
            count = a - 1;
        } else {
            count = a;
        }

        // Print required odd numbers
        for (int i = 1; i <= count; i++) {
            int oddNumber = 2 * i - 1;
            System.out.print(oddNumber);

            if (i < count) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}
