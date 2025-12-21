import java.util.Scanner;
public class error{
    public static void main(String arg[]){
        Scanner scn = new Scanner(System.in);
        try{
            System.out.println("Please enter your two numbers:");
            int x = scn.nextInt();
            int y = scn.nextInt();
            int z = x/y;
            System.out.println(x+"/"+y+"="+z);
        }catch(ArithmeticException ex){
            System.out.println("------catch block-------");
            System.out.println(ex.toString());
        }finally{
            System.out.println("------finally block-----");
            System.out.println("System designed and developed by");
            System.out.println("@team codlingal");
        }
    }
}