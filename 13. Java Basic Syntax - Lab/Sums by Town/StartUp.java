import java.util.*;

public class StartUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int val = Integer.parseInt(scan.nextLine());

        TreeMap<String,Double> dict = new TreeMap<>();
        for (int i = 0; i < val; i++){
            String[] array = scan.nextLine().split("\\|");
            String town = array[0].trim();
            Double income = Double.parseDouble(array[1].trim());

            if (!dict.containsKey(town))
                dict.put(town,income);
            else
                dict.put(town,dict.get(town)+income);
        }
        for (Map.Entry<String,Double> entry: dict.entrySet()) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}

