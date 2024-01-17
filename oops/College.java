package oops;
abstract class Department {
    int size = 80;
    abstract int getDepartmentSize();
}

class Deptsize extends Department{
    public int getDepartmentSize()
    {
        return size;

    }
}
public class College{
    public static void main(String args[]) {
        Deptsize dept = new Deptsize();
        System.out.println(dept.getDepartmentSize());
    }
}