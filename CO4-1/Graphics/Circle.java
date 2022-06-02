package Graphics;
interface ShapeC{
    double area();
}
public class Circle implements ShapeC {
    private double radius;
    // double radius=radius1;

    public Circle(double radius){
        this.radius=radius;
      }

    public double area(){
        return Math.PI*radius*radius;
    }
}
