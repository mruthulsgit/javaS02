package Graphics;

interface ShapeTr{
    double area();
}

public class Triangle implements ShapeTr{
    double height;
    double base;

    public Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }

    public double area(){
        return (base* height)/2;
    }
    
}
