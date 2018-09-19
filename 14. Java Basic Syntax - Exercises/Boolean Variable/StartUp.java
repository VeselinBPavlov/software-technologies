import java.util.*;

public class StartUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        if (word.equals("True"))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}