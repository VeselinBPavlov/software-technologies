import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StartUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = Arrays.stream(scan.nextLine()
                            .split(" "))
                            .map(Integer::parseInt)
                            .sorted(Comparator.reverseOrder())
                            .limit(3)
                            .mapToInt(i -> i)
                            .toArray();

        for (Integer item : array) {
            System.out.println(item);
        }
    }
}