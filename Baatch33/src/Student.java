public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        // Example usage
        Student student = new Student("Sriram Attaluri");
        System.out.println("Student's name: " + student.getName());
    }
}
