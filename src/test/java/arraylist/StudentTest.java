package arraylist;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {

    Student student = new Student();

    /*
     * Success case
     * The average from the list is 3.46
     * If the student is less than 3.46 is removed.
     */
    @Test
    public void testRemoveStudentSuccess() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Rajiv", "Ram", 3.5));
        students.add(new Student("Raju", "S", 3.1));
        students.add(new Student("Anvesh", "B", 3.8));
        students = student.removeStudentsByGPA(students);
        Assert.assertEquals(2, students.size());
    }

    /*
     * Failure case
     * To check whether the input is empty list.
     */
    @Test
    public void testRemoveStudentFailure() {
        ArrayList<Student> students = new ArrayList<>();
        student.removeStudentsByGPA(students);
        Assert.assertTrue(students.isEmpty());
    }

    /*
     * Edge case
     * No student should be removed when the GPA are similar to all students.
     */
    @Test
    public void testRemoveStudentEdge() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Shiva", "Sai", 3.5));
        students.add(new Student("Teja", "A", 3.5));
        students.add(new Student("Venkat", "B", 3.5));
        student.removeStudentsByGPA(students);
        Assert.assertEquals(3, students.size());
    }

}