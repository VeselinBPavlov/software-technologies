import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class StartUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalBooks = Integer.parseInt(scan.nextLine());
        TreeMap<String, Double> data = new TreeMap<>();

        for (int i = 0; i < totalBooks; i++) {
            String[] parts = scan.nextLine().split(" ");

            Book book = new Book(
                    parts[0],
                    parts[1],
                    parts[2],
                    LocalDate.parse(parts[3], DateTimeFormatter.ofPattern("dd.MM.yyyy")),
                    parts[4],
                    Double.parseDouble(parts[5])
            );

            if (!data.containsKey(book.getAuthor())) {
                data.put(book.getAuthor(), 0.0);
            }

            double currentPriceSum = data.get(book.getAuthor());
            currentPriceSum += book.getPrise();
            data.put(book.getAuthor(), currentPriceSum);
        }

        data
                .entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    int priceCompair = e2.getValue().compareTo(e1.getValue());
                    if (priceCompair == 0) {
                        return e1.getKey().compareTo(e2.getKey());
                    }
                    return priceCompair;
                })
                .forEach(e -> System.out.printf("%s -> %.2f%n", e.getKey(), e.getValue()));

    }
}