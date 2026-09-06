
class Tail_Recursion{
    static int factorial(int n, int result){
        if (n == 0){
            return result;
        }
        return factorial(n-1, result*n);
    }
    public static void main(String[] args){
        int n = 5;
        int answer = factorial(n,1);
        System.out.println("Factorial of "+n+" = "+answer);
    }
}