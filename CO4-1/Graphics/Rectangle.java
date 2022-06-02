package Graphics;

interface ShapeR{
    double area();
}

public class Rectangle implements ShapeR {
    private double length;
    private double breadth;
    
    

    public Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
      }

    public double area(){
        return length*breadth;
    }
}
