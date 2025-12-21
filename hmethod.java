interface MyInterface{
    public void method1();
    public void method2();
}
class hmethod implements MyInterface{
    public void method1(){
        System.out.println("implementation of method1.");
    }
    public void method2(){
        System.out.println("Implementation of method2.");
    }
    public static void main(String arg[]){
        MyInterface obj = new hmethod();
        obj.method1();
        obj.method2();
    }
}