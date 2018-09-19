import java.util.Scanner;

public class StartUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i >= 1 && i<=9) {
                System.out.printf("%d ", i);
                continue;
            }
            if (isSymmetric(i) == true) {
                System.out.printf("%d ", i);
            }
        }

    }

    public static boolean isSymmetric (long number) {
        if (number == 0) return true;
        else if (number < 0) return false;
        long DEG_10 = (long)(Math.pow(10, (int)Math.log10(number)));

        while (number > 0){
            long dStart = number / DEG_10;
            long dEnd = number % 10;
            if (dStart != dEnd) return false;
            number = (number - dStart * DEG_10 - dEnd) / 10;
            DEG_10 /= 100;
        }

        return true;
    }
}