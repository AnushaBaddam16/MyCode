package arrays;

public class Rotatearray {
        public static void main(String args[]){
            int a[]={1, 2, 3, 4, 5, 6, 7,8};
            int x=2,j=0;
            int n=a.length-x;
            int b[] = new int[a.length];
            for(int i=0;i<a.length;i++){
                if(i<x){
                    b[n++]=a[i];
                }
                if(i>=x){
                    b[j++] = a[i];}
            }
            for(int i=0;i<b.length;i++)
                System.out.print(b[i]+" ");
        }
    }