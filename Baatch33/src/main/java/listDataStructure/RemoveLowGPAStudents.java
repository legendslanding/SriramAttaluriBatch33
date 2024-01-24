package listDataStructure;

import java.util.ArrayList;
import java.util.Iterator;



public class RemoveLowGPAStudents {
    public static void main(String[] args) {
        // Create an ArrayList of Students
        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("John", "Doe", 3.8));
        studentsList.add(new Student("Jane", "Smith", 3.2));
        studentsList.add(new Student("Bob", "Johnson", 2.9));
        studentsList.add(new Student("Alice", "Williams", 4.0));
        studentsList.add(new Student("Charlie", "Brown", 3.5));

        // Calculate the average GPA
        double totalGPA = 0;
        for (Student student : studentsList) {
            totalGPA += student.gpa;
        }
        double averageGPA = totalGPA / studentsList.size();

        // Remove students with GPA less than the average GPA
        Iterator<Student> iterator = studentsList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.gpa < averageGPA) {
                iterator.remove();
            }
        }

        // Print the remaining students
        System.out.println("Remaining Students:");
        for (Student student : studentsList) {
            System.out.println("Name: " + student.firstName + " " + student.lastName + ", GPA: " + student.gpa);
        }
    }
}
