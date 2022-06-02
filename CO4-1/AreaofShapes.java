import java.util.Scanner;
import Graphics.*;

public class AreaofShapes {
    public static void main(String args[]){
        // Scanner sc=new Scanner();
        // Rectangle r1=new Rectangle(length,breadth);
        // Circle c1=new Circle(radius);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your choice");
        int choice=sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("enter the length of rect");
                double length=sc.nextDouble();
                System.out.println("enter the breadth of rect");
                double breadth=sc.nextDouble();
                Rectangle r1=new Rectangle(length,breadth);

                System.out.println("area  of rect"+r1.area());
                break;
            case 2:
                System.out.println("enter the radius of circle");
                double radius=sc.nextDouble();
                Circle c1=new Circle(radius);
                System.out.println("area  of circle"+c1.area());
                // double area=sc.nextDouble();
                
                

                break;
        
            case 3:
                System.out.println("enter the base of triangle");
                double base=sc.nextDouble();
                System.out.println("enter the base of triangle");
                double height=sc.nextDouble();
                Triangle t1=new Triangle(base,height);
                System.out.println("area  of triangle"+t1.area());

                break;
                
            case 4:
            System.out.println("enter the length of square");
                double side=sc.nextDouble();
                Square s1=new Square(side);
                System.out.println("area  of square"+s1.area());
                break;    
            default:
                System.out.println("wrong choice");
        // Scanner sc=new Scanner();
        // Rectangle r1=new Rectangle(length,breadth);
        // Circle c1=new Circle(radius);
        }

    }
}
 

