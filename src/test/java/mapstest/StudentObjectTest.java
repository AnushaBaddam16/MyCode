package mapstest;
import maps.ReturnStudentObject;
import maps.Student;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;

public class StudentObjectTest {

    ReturnStudentObject obj = new ReturnStudentObject();
    String[] firstnames = {"a", "b", "c", "d", "e", "f", "g", "h"};
    String[] lastnames = {"A", "B", "C", "D", "E", "F", "G", "H"};
    double[] gpa = {4.0, 4.1, 4.2, 4.3, 4.4, 4.5, 4.6, 4.7};
    HashMap<String, Student> studentobj = new HashMap<>();

    @Test
    public void testStudentObjectForValidFirstName() {
        for (int i = 0; i < firstnames.length; i++) {
            studentobj.put(firstnames[i], new Student(firstnames[i], lastnames[i], gpa[i]));
        }

        // True cases
        assertEquals(studentobj.get("a"), obj.returnStudentObj(studentobj, "a"));
        assertEquals(studentobj.get("f"), obj.returnStudentObj(studentobj, "f"));
    }

    @Test
    public void testStudentObjectNotSameForDifferentNames() {
        for (int i = 0; i < firstnames.length; i++) {
            studentobj.put(firstnames[i], new Student(firstnames[i], lastnames[i], gpa[i]));
        }

        // False case
        assertNotSame(studentobj.get("b"), obj.returnStudentObj(studentobj, "a"));
    }

    @Test
    public void testStudentObjectForNullName() {
        assertNull(obj.returnStudentObj(studentobj, null));
    }
}
