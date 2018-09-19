import java.util.*;

public class StartUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String letters = scan.nextLine();

        for (int i = 0; i < letters.length(); i++) {
            System.out.println(letters.charAt(i) + " -> "+(letters.charAt(i)-97));
        }
    }
}