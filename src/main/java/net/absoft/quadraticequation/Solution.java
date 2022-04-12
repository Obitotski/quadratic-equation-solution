package net.absoft.quadraticequation;

public class Solution {
    private double x1;
    private double x2;

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }
}

class QuadraticEquationSolver {

    public static Solution solveQuadraticEquation(double a, double b, double c) {

        double discriminant = calculateDiscriminant(a,b,c); //The formula for determining the discriminant
        if (discriminant > 0)
            return calculateRootsWhenDiscriminantIsMoreThanZero(discriminant, a, b); //If the discriminant is more than zero
        else if (discriminant == 0)
            return calculateRootsWhenDiscriminantIsEqualToZero(a, b); //If the discriminant is equal to zero

        return null; //If the discriminant is less than zero
    }

    private static double calculateDiscriminant(double a, double b, double c){
        return Math.pow(b, 2) - (4 * a * c);
    }

    private static Solution calculateRootsWhenDiscriminantIsMoreThanZero(double d, double a, double b) {
        Solution solution = new Solution();
        double x1;
        double x2;
        x1 = (-b + Math.sqrt(d)) / (2 * a);
        x2 = (-b - Math.sqrt(d)) / (2 * a);
        solution.setX1(x1);
        solution.setX2(x2);
        return solution;
    }

    private static Solution calculateRootsWhenDiscriminantIsEqualToZero(double a, double b) {
        Solution solution = new Solution();
        double x;
        x = -b / (2 * a);
        solution.setX1(x);
        solution.setX2(x);
        return solution;
    }
}
