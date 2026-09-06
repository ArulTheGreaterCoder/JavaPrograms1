import java.util.*;

class Head_Recursion{
    static void PrintNumbers(int n){
        if (n == 0){
            return;
        }
        PrintNumbers(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your number to print all range of numbers: ");
        int num = scn.nextInt();
        PrintNumbers(num);
    }
}