import java.util.Scanner;
public class Complex {

    double real;
    double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public static void main(String[] args) {
	double r1,i1,r2,i2;
        Scanner in = new Scanner(System.in);
        System.out.println("Real part and  Imaginary part of 1st compNo:  ");
        r1 = in.nextInt();
        i1 = in.nextInt();
        System.out.println("Real part and  Imaginary part of 2nd compNo: ");
        r2 = in.nextInt();
        i2 = in.nextInt();
        Complex n1 = new Complex(r1,i1),
                n2 = new Complex(r2, i2),
                temp;

        temp = add(n1, n2);

        System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);
    }

    public static Complex add(Complex n1, Complex n2)
    {
        Complex temp = new Complex(0.0, 0.0);

        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;

        return(temp);
    }
}
