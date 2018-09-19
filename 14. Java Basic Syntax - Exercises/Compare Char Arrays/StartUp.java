import java.util.*;

public class StartUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstArray = scan.nextLine();
        String secondArray = scan.nextLine();

        int equals = firstArray.compareTo(secondArray);

        if (equals < 0) {
            System.out.println(firstArray.replaceAll("\\W", ""));
            System.out.println(secondArray.replaceAll("\\W", ""));
        } else {
            System.out.println(secondArray.replaceAll("\\W", ""));
            System.out.println(firstArray.replaceAll("\\W", ""));
        }
    }
}