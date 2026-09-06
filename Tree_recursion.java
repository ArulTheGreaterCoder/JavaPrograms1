
class Tree_recursion{
    static void printNumbers(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        printNumbers(n-1);
        printNumbers(n-2);
    }
    public static void main(String[] args){
        printNumbers(5);
    }
}