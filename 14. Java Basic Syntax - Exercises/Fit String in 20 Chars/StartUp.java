import java.util.*;

public class StartUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        if(text.length() < 20) {
            StringBuilder padd = new StringBuilder(text);
            while(padd.length() != 20) {
                padd.append('*');
            }
            System.out.println(padd);
        } else {
            text = text.substring(0, 20);
            System.out.println(text);
        }
    }
}