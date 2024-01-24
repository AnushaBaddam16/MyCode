
package oops;
class Square{
    public int mathFun(int a, int b){
        int area1 = a*b;
        return area1;
    }
}
//Child class
class Rectangle extends Square {
    //Overridden Method
    public int mathFun(int a, int b){
        int area2 = a*b;
        return area2;
    }
}
class Circle extends Square {
    //Overridden Method
    public int mathFun(int a, int b){
        int perimeter = (a*b);
        return perimeter;
    }
}
public class Shapes {
    public static void main(String args[]){
        Square obj1 = new Rectangle();
        Square obj2 = new Circle();
        System.out.println(obj1.mathFun(6,4));
        System.out.println(obj2.mathFun(4,2));
    }
}

