import java.util.Scanner;

public class StartUp {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       int num1 = scanner.nextInt();
       int num2 = scanner.nextInt();
       int num3 = scanner.nextInt();
       
       if (!checkNums(num1, num2, num3) && !checkNums(num3, num1, num2) && !checkNums(num2, num3, num1)) {
            System.out.println("No");
       }       

       
    }
    
    static boolean checkNums(int num1, int num2, int sum) {
        if (num1 + num2 != sum) {
            return false;
        }
        if (num1 <= num2) {
            System.out.printf("%d + %d = %d%n", num1, num2, sum);
        }
        else {
            System.out.printf("%d + %d = %d%n", num2, num1, sum);
        }
        return true;
    }
}