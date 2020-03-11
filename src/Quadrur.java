import java.util.ArrayList;

public class Quadrur {

    double a, b, c, D;

    Quadrur(double a, double b, double c) throws NoSolutionException {
        this.a = a;
        this.b = b;
        this.c = c;
        findDiscriminant();
        verificationDiscriminant();
    }

    public ArrayList<Double> solutionQuadrur()  {
        ArrayList<Double> solution = new ArrayList<Double>();
        if (findDiscriminant() == 0) {
            solution.add(findX());
            return solution;
        } else if (findDiscriminant()>0){
            solution.add(findX());
            solution.add(findSecondX());
            return solution;
        }
        return solution;
    }

    private double findDiscriminant() {
        return D = b * b - 4 * a * c;

    }

    public void verificationDiscriminant() throws NoSolutionException {
        if (D < 0) {
            throw new NoSolutionException("Корней нет, дискриминант меньше нуля");
        }
    }

    private double findX() {
        return ((-b + Math.sqrt(findDiscriminant())) / (2*a));
    }

    private double findSecondX() {
        return ((-b - Math.sqrt(findDiscriminant())) / (2*a));
    }
}
