package net.absoft.quadraticequation;

public class Solution {
    private double x1;
    private double x2;

    public Solution solutionOfQuadraticEquation(double a, double b, double c) {
        Solution solution;
        double discriminant;
        discriminant = Math.pow(b, 2) - (4 * a * c); //The formula for determining the discriminant
        if (discriminant > 0)
            solution = discriminantIsMoreThanZero(discriminant, a, b); //If the discriminant is more than zero
        else if (discriminant == 0)
            solution = discriminantIsEqualToZero(a, b); //If the discriminant is equal to zero
        else solution = null; //If the discriminant is less than zero
        return solution;
    }

    private Solution discriminantIsMoreThanZero(double d, double a, double b) {
        Solution solution = new Solution();
        double x1;
        double x2;
        x1 = (-b + Math.sqrt(d)) / (2 * a);
        x2 = (-b - Math.sqrt(d)) / (2 * a);
        solution.setX1(x1);
        solution.setX2(x2);
        return solution;
    }

    private Solution discriminantIsEqualToZero(double a, double b) {
        Solution solution = new Solution();
        double x;
        x = -b / (2 * a);
        solution.setX1(x);
        solution.setX2(x);
        return solution;
    }

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
