package Graphics;
interface ShapeSq{
    double area();
}
public class Square implements ShapeSq {
    double side;

    public Square(double side){
        this.side=side;
    }

    public double area(){
        return (side* side);
    }
    
}



    

