import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

public class HighestMarks {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Rahul", 85));
        students.add(new Student("Priya", 55));
        students.add(new Student("Amit", 72));
        students.add(new Student("Sneha", 48));
        students.add(new Student("Kiran", 90));

        Student topper = students.stream()
                .max(Comparator.comparingInt(s -> s.marks))
                .orElse(null);

        System.out.println("Student with Highest Marks:");
        System.out.println(topper);
    }
}