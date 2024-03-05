package edu.upc.dsa.calculator;

public class Cos implements Operation{
    @Override
    public double operation(double a, double b) {
        double sol = Math.cos(a);
        if(b== 0) //si es un 0 el resultado es en radianes
            return Math.toRadians(sol);
        else
            return Math.toDegrees(sol);
    }
}
