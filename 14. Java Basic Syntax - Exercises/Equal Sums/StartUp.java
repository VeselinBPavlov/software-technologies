import java.util.*;

public class StartUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int array[] = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        int index = 0;
        boolean isEqual = false;

        for (int i = 0; i < array.length ; i++) {
            int rightSum = 0;
            int leftSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += array[j];
            }
            for (int j = i + 1; j < array.length; j++) {
                rightSum += array[j];
            }

            if (leftSum == rightSum) {
                isEqual = true;
                index = i;
            }
        }

        if (isEqual) {
            System.out.println(index);
        } else {
            System.out.println("no");
        }
    }
}