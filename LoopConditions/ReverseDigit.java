package LoopConditions;
public class ReverseDigit {

    static int reverseDigit(int number){
        int reverseNumber = 0;
        while(number > 0){
            int remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            number /= 10;
        }
        return  reverseNumber;
    }

    public static void main(String[] args) {
        System.out.println(reverseDigit(12345));

    }
}