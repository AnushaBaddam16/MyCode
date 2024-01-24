package arraylist;
import java.util.ArrayList;
public class Student {

    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public Student() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public ArrayList<Student> removeStudentsByGPA(ArrayList<Student> students) {
        double totalGPA = 0.0;
        for (Student student : students)
            totalGPA += student.getGpa();
        double averageGPA = totalGPA / students.size();
        ArrayList<Student> removeList = new ArrayList<>();
        for (Student student : students) {
            if (student.getGpa() < averageGPA)
                removeList.add(student);
        }
        students.removeAll(removeList);
        return students;
    }

}
