import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int decNum = Integer.parseInt(scan.nextLine());

         System.out.println(Integer.toHexString(decNum).toUpperCase());
          System.out.println(Integer.toBinaryString(decNum));
    }
}