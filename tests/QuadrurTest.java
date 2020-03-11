import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;

public class QuadrurTest {


    @Test(expected = NoSolutionException.class)
    public void negativeDiscriminate() throws NoSolutionException {
        Quadrur quadrur = new Quadrur(4, 1, 1);
        ArrayList exceptedArrayList = new ArrayList();
        double[] exceptedArray = new double[2];
        exceptedArray[0] = (double)exceptedArrayList.get(0);
        exceptedArray[1] = (double)exceptedArrayList.get(1);
        ArrayList solution = quadrur.solutionQuadrur();
        double[] resultArray = new double[2];
        resultArray[0] =(double) solution.get(0);
        resultArray[1] = (double) solution.get(1);
        assertArrayEquals(exceptedArray,resultArray,0);
    }

    @Test
    public void zeroDiscriminant() throws NoSolutionException {
        Quadrur quadrur = new Quadrur(1, 4, 4);
        ArrayList exceptedArrayList = new ArrayList();
        exceptedArrayList.add(-2);
        double[] exceptedArray = new double[1];
        exceptedArray[0] = (int)exceptedArrayList.get(0);
        ArrayList solution = quadrur.solutionQuadrur();
        double[] resultArray = new double[1];
        resultArray[0] =(double) solution.get(0);
        assertArrayEquals(exceptedArray,resultArray,0);
    }

    @Test
    public void positiveDiscriminant() throws NoSolutionException {
        Quadrur quadrur = new Quadrur(2, 5, -7);
        ArrayList exceptedArrayList = new ArrayList();
        exceptedArrayList.add(1);
        exceptedArrayList.add(-3.5);
        double[] exceptedArray = new double[2];
        exceptedArray[0] = (int)exceptedArrayList.get(0);
        exceptedArray[1] = (double)exceptedArrayList.get(1);
        ArrayList solution = quadrur.solutionQuadrur();
        double[] resultArray = new double[2];
        resultArray[0] =(double) solution.get(0);
        resultArray[1] = (double) solution.get(1);
        assertArrayEquals(exceptedArray,resultArray,0);
    }

}