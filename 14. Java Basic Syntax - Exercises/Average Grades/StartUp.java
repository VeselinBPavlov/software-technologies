import java.util.*;
import java.util.stream.Collectors;

public class StartUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalStudents = Integer.parseInt(scan.nextLine());

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < totalStudents; i++) {
            String[] parts = scan.nextLine().split(" ");

            String name = parts[0];
            ArrayList<Double> grades = new ArrayList<>();

            for (int j = 1; j < parts.length; j++) {
                grades.add(Double.parseDouble(parts[j]));
            }

            students.add(new Student(name, grades));
        }

        students
                .stream()
                .filter(s -> s.getAverageGrade() >= 5)
                .sorted(Comparator
                        .comparing(Student::getName)
                        .thenComparing(Comparator.comparing(Student::getAverageGrade).reversed()))
                .collect(Collectors.toList())
                .forEach(r -> System.out.printf("%s -> %.2f%n", r.getName(), r.getAverageGrade()));
    }
}