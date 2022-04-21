package net.absoft.quadraticequation;

import org.testng.Assert;
import org.testng.annotations.Test;

import static net.absoft.quadraticequation.QuadraticEquationSolver.solveQuadraticEquation;

public class SolutionTest {

    @Test
    public void testQuadraticEquationSolutionWhenDiscriminantIsLessThanZero() {
        Solution solution = solveQuadraticEquation(3, -4, 2);
        Assert.assertNull(solution, "Solution of the quadratic equation should be null when discriminant is less than zero");
    }

    @Test
    public void testQuadraticEquationSolutionWhenDiscriminantIsMoreThanZero() {
        Solution solution = solveQuadraticEquation(1, -4, -5);
        Assert.assertTrue((solution.getX1() == 5)||(solution.getX1() == -1), "The roots of the quadratic equation are incorrect when discriminant is more than zero");
        Assert.assertTrue((solution.getX2() == 5)||(solution.getX2() == -1), "The roots of the quadratic equation are incorrect when discriminant is more than zero");
    }

    @Test
    public void testQuadraticEquationSolutionWhenDiscriminantIsEqualToZero() {
        Solution solution = solveQuadraticEquation(1, -4, 4);
        Assert.assertTrue((solution.getX1() == solution.getX2()),"The roots of the quadratic equation are incorrect when discriminant is equal to zero");
        Assert.assertEquals(solution.getX1(),2,"The roots of the quadratic equation are incorrect when discriminant is equal to zero");
    }

    @Test
    public void testThatFirstArgumentOfQuadraticEquationIsNotAZero(){
        Assert.assertThrows(IllegalArgumentException.class, () -> solveQuadraticEquation(0,10,0));
    }




}
