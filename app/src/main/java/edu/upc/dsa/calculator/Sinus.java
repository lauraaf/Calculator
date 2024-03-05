package edu.upc.dsa.calculator;

public class Sinus implements Operation{
    @Override
    public double operation(double a, double b) {
        double sol = Math.sin(a);
        if(b==0)
            return Math.toRadians(sol);
        else
            return Math.toDegrees(sol);
    }
}
