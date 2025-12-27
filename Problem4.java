import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers separated by space:");
        String input = sc.nextLine();

        String[] parts = input.split(" ");
        int[] numbers = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }

        Map<Integer, Integer> result = new HashMap<>();

        // Count multiples from 1 to 9
        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int num : numbers) {
                if (num % i == 0) {
                    count++;
                }
            }
            result.put(i, count);
        }

        // Print in required dictionary format
        System.out.print("{");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + ":" + result.get(i));
            if (i < 9) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        sc.close();
    }
}
