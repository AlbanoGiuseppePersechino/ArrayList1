import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Rocco", 18);
        Student student2 = new Student("Giuseppe", 18);

        // New Students
        Student student3 = new Student("Mario", 18);
        Student student4 = new Student("Luca", 19);
        Student student5 = new Student("Andrea", 20);
        Student student6 = new Student("Davide", 21);

        List<Student> studentsList = Arrays.asList(student1, student2);

        System.out.println(studentsList);

        List<Student> allStudents = new ArrayList<>(studentsList);
        allStudents.add(student3);
        allStudents.add(student4);
        allStudents.add(student5);
        allStudents.add(student6);

        System.out.println("All students: " + allStudents);
    }
}
