import java.util.*;

public class StartUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int array[] = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .mapToInt(i -> i)
                .toArray();

        int bestCount = 0;
        int specialNum = 0;

        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                int searchedNum = array[j];
                if(searchedNum == number) {
                    count++;
                }
            }
            if(count > bestCount) {
                bestCount = count;
                specialNum = number;
            }
        }

        System.out.println(specialNum);
    }
}