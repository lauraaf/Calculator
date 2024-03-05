package edu.upc.dsa.calculator;

public class Tangent implements Operation{
    @Override
    public double operation (double a, double b) {
        double sol = Math.tan(a);
        if(b==0)
            return Math.toRadians(sol);
        else
            return Math.toDegrees(sol);
    }
}
