import java.util.*;

public class StartUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        String reverse = new StringBuffer(text).reverse().toString();
        System.out.println(reverse);
    }
}