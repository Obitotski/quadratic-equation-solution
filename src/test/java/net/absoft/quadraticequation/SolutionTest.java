package net.absoft.quadraticequation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionTest {

    @Test
    public void testQuadraticEquationSolutionWhenDiscriminantIsLessThanZero() {
        Solution solution = new Solution();
        solution = solution.solutionOfQuadraticEquation(3, -4, 2);
        Assert.assertNull(solution, "Solution of the quadratic equation is not null when discriminant is less than zero");
    }

    @Test
    public void testQuadraticEquationSolutionWhenDiscriminantIsMoreThanZero() {
        Solution solution = new Solution();
        solution = solution.solutionOfQuadraticEquation(1, -4, -5);
        Assert.assertEquals(solution.getX1(), 5, "The x1 root of the quadratic equation is incorrect when discriminant is more than zero");
        Assert.assertEquals(solution.getX2(), -1, "The x2 root of the quadratic equation is incorrect when discriminant is more than zero\"");
    }

    /* In case, we`ll have an example when discriminant is equal to zero
    @Test
    public void testQuadraticEquationSolutionWhenDiscriminantIsEqualToZero() {
        Solution solution = new Solution();
        solution = solution.solutionOfQuadraticEquation(1, -4, 4);
        Assert.assertTrue((solution.getX1() == solution.getX2()),"Roots of the quadratic equation are not equal when discriminant is equal to zero");
        Assert.assertEquals(solution.getX1(),2,"The roots of the quadratic equation are incorrect when discriminant is equal to zero");

    }

     */


}
