import java.util.Scanner;

public class numbers{
    public static void main(String[] args){
        System.out.print("Enter the number of element you want in array:");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 0; i<=n; i++){
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            System.out.print("Enter your element for array:");
            int val = scn.nextInt();
            if (val>max){
                max = val;
            }
            if (val<min){
                min = val;
            }int span = max-min;
            System.out.print("The max value of array is "+max+" and min value of array is "+min);
            System.out.print("The span of array is "+span);
}
}
}