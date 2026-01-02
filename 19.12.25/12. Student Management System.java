import java.util.ArrayList;

class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name;
    }
}

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Revanth", 1));
        students.add(new Student("Priya", 2));
        students.add(new Student("Arjun", 3));

        System.out.println("Student List:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
