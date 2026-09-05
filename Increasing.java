import java.util.*;

public class Increasing{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number to till you have to start:");
        int n = scn.nextInt();
        NumIncreasing(1,n);
    }
    public static void NumIncreasing(int num, int n){
        if (num>n){
            return;
        }System.out.println(num);
        NumIncreasing(num+1,n);
    }
}