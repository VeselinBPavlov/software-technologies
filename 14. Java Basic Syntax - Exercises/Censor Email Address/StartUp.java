import java.util.*;

public class StartUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String email = scan.nextLine();
        String[] emailData = email.split("@");
        String text = scan.nextLine();
        StringBuilder replacement = new StringBuilder();

        for (int i = 0; i < emailData[0].length(); i++) {
            replacement.append("*");
        }
        replacement.append("@");
        replacement.append(emailData[1]);

        System.out.println(text.replaceAll(email,replacement.toString()));
    }
}