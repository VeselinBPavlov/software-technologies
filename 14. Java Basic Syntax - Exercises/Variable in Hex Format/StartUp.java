import java.util.*;

public class StartUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String hexnum = scan.nextLine();

        System.out.println(Integer.parseInt(hexnum,16));
    }
}