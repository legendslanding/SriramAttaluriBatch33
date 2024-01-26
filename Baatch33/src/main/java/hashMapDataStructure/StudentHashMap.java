package hashMapDataStructure;

import java.util.HashMap;

public class StudentHashMap {
    private HashMap<String, Student> studentMap;

    public StudentHashMap() {
        studentMap = new HashMap<>();

        initializeStudentMap();
    }

    private void initializeStudentMap() {

        studentMap.put("John", new Student("John", "Doe", 3.8));
        studentMap.put("Jane", new Student("Jane", "Smith", 3.5));
        studentMap.put("Bob", new Student("Bob", "Johnson", 3.2));
        studentMap.put("Alice", new Student("Alice", "Williams", 4.0));
        studentMap.put("Charlie", new Student("Charlie", "Brown", 3.7));
        studentMap.put("Eva", new Student("Eva", "Davis", 3.9));
        studentMap.put("Frank", new Student("Frank", "Miller", 3.4));
        studentMap.put("Grace", new Student("Grace", "Jones", 3.1));
    }

    public Student getStudentByName(String firstName) {

        return studentMap.get(firstName);
    }

    /*public static void main(String[] args) {

        StudentHashMap studentHashMap = new StudentHashMap();


        Student john = studentHashMap.getStudentByName("John");
        System.out.println("Student details for John: " + john.firstName + " " + john.lastName + ", GPA: " + john.gpa);

        Student alice = studentHashMap.getStudentByName("Alice");
        System.out.println("Student details for Alice: " + alice.firstName + " " + alice.lastName + ", GPA: " + alice.gpa);
    }*/

}
