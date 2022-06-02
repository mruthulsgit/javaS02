package Arithmetic;

interface MathsOperable {
    double add();
    double sub();
    double mul();
    double div();
}

public class MathOperation implements MathsOperable {

    private double no1;
    private double no2;

    

    public MathOperation(double no1, double no2) {
        this.no1 = no1;
        this.no2 = no2;
    }

    public double add () {
        return no1+no2;
    }

    public double sub() {
        return no1-no2;
    }

    public double mul() {
        return (no1*no2);
    }

    public double div() {
        return (no1/no2);
    }
}

    

