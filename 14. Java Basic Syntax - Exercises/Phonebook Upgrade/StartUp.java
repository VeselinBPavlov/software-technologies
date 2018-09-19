import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String phoneData = scan.nextLine();

        TreeMap<String, String> phonebook =  new TreeMap<>();

        while (!phoneData.equals("END")){

            if(phoneData.equals("ListAll")) {
                for (Map.Entry<String,String> entry : phonebook.entrySet()) {
                    System.out.println(entry.getKey()+" -> "+entry.getValue());
                }
                phoneData = scan.nextLine();
                continue;
            }
            String[] array = phoneData.split(" ");
            String command = array[0];
            String name = array[1];

            if (command.equals("A")){
                String number = array[2];
                if (!phonebook.containsKey(name)){
                    phonebook.put(name,number);
                }
                phonebook.put(name,number);
            }
            else if (command.equals("S")){
                if (!phonebook.containsKey(name)){
                    System.out.printf("Contact %s does not exist.",name);
                    System.out.println();
                }
                else {
                    System.out.println(name+" -> "+phonebook.get(name));
                }
            }
            phoneData = scan.nextLine();
        }
    }
}