import java.util.Scanner;

public class FindElementArray{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the element you have to find:");
        int d = scn.nextInt();

        System.out.print("Enter the number of elements in the array:");
        int n = scn.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the "+n+" elements of the array:");
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int ans = find(arr,d);

        System.out.println(ans);
    }

    public static int find(int[] arr, int d){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == d){
                return i;
            }
        }
        return -1;
    }
}