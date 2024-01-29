package maps;

import java.util.HashMap;
import java.util.Map;

public class ReturnStudentObject {
    public static HashMap<String, Student> studentObjects() {
        HashMap<String, Student> studentobj = new HashMap<>();
        for (Map.Entry<String, Student> entry : studentobj.entrySet()) {
            Student student = entry.getValue();
            studentobj.put(student.getFirstName(),student);
        }
        return studentobj;
    }
    public static Student returnStudentObj(HashMap<String,Student> studentobj, String name){
        return studentobj.get(name);
    }
}