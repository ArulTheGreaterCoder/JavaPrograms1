abstract class geometric{
    public void shape(){
        System.out.println("I am shape!");
    }
    abstract void volume();
}
class Cube extends geometric{
    void volume(int Length){
        System.out.println("Volume of cube is "+6*Length);
    }
}
class Cuboid extends geometric{
    void volume(int Length, int Breadth, int Height){
        System.out.println("Volume of cuboid is "+ Length*Breadth*Height);
    }
}
class Sphere extends geometric{
    void volume(int radius){
        System.out.println("Volume of sphere is "+ 4/3*(radius^3));
    }
}
public class main2{
    public static void main(String args[]){
        Cube cub = new Cube();
        Cuboid cubo = new Cuboid();
        Sphere sph = new Sphere();
        cub.volume(10);
        cubo.volume(10,20,30);
        sph.volume(4);
    }
}