import java.util.*;

public class StartUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String character = scan.nextLine();

        if ((character.equals("a")) || (character.equals("e")) || (character.equals("i"))
                || (character.equals("o")) || (character.equals("u")))
        {
            System.out.println("vowel");
        }
        else if (character.matches("\\d"))
        {
            System.out.println("digit");
        }
        else
        {
            System.out.println("other");
        }
    }
}