package listDataStructure;

import org.testng.annotations.Test;
import listDataStructure.RemoveLowGPAStudents;
import java.util.*;

import static junit.framework.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

public class RemoveLowGPAStudentsTest {
    @Test
    public void testRemoveLowGPAStudents() {
        ArrayList<Student> studentsList = new ArrayList<>();

        studentsList.add(new Student("John", "Doe", 3.8));
        studentsList.add(new Student("Jane", "Smith", 3.2));
        studentsList.add(new Student("Bob", "Johnson", 2.9));
        studentsList.add(new Student("Alice", "Williams", 4.0));
        studentsList.add(new Student("Charlie", "Brown", 3.5));

        studentsList = RemoveLowGPAStudents.removeLowGPAStudents(studentsList);

        
        for (Student student : studentsList) {
            assertTrue(student.gpa >= 3.2);
        }
    }

}




