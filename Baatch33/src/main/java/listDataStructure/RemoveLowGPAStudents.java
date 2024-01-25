package listDataStructure;

import java.util.ArrayList;
import java.util.Iterator;



public class RemoveLowGPAStudents {

    public static ArrayList<Student> removeLowGPAStudents(ArrayList<Student> studentsList){
        if(!studentsList.isEmpty()) {
            double totalGPA = 0;
            for (Student student : studentsList) {
                totalGPA += student.gpa;
            }
            double averageGPA = totalGPA / studentsList.size();


            Iterator<Student> iterator = studentsList.iterator();
            while (iterator.hasNext()) {
                Student student = iterator.next();
                if (student.gpa < averageGPA) {
                    iterator.remove();
                }
            }
        }
        return studentsList;


    }

}
