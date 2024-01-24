package arrays;

public class SmallLargeNum {

    public int SmallNumber(int num[]){
        int min=num[0];
        for(int i=0; i<num.length; i++){
            if(num[i]<min)
                min=num[i];
        }
        return min;
    }

    public int LargeNumber(int num[]){
        int max=0;
        for(int i=0; i<num.length; i++){
            if(num[i]>max)
                max=num[i];
        }
        return max;
    }

    public static void main(String[] arg){
        SmallLargeNum m=new SmallLargeNum();
        int[] num = {3,17,23,56,65,76,99};

        System.out.println("smallest Number of array is "+m.SmallNumber(num));
        System.out.println("largest  Number of array is "+m.LargeNumber(num));
    }
}
