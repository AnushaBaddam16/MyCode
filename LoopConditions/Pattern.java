package LoopConditions;
public class Pattern {

    public static void main(String[] args) {
        int a = 5;
        for (int i = 0; i < a ; i++){
            for (int j = a - i -2; j >= 0; j--){
                System.out.print("+");
            }
            for (int j = a -2 -i; j < a; j++){
                System.out.print("-");
            }
            System.out.println(" ");
        }
    }
}
