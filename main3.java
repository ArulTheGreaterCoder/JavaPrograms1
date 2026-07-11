import java.util.Scanner;
interface MyBankInterface{
    public void method1();
}
class main3 implements MyBankInterface{
    public void method1(){
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your bank account amount:");
            int Bankaccountamount = scanner.nextInt();
            if (Bankaccountamount < 5000){
                System.out.println("It is not that much amount.");
            }else{
                System.out.println("Searching...... Please wait");
                System.out.println("Found");
            }
        }
        finally{
            System.out.println("Process completed.");
        }
        MyBankInterface obj1 = new main3();
        obj1.method1();
    }
}