import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Quadrur quadrur = new Quadrur(sc.nextInt(), sc.nextInt(), sc.nextInt());
            ArrayList<Double> x = quadrur.solutionQuadrur();
            System.out.println(x);
        } catch (NoSolutionException e) {
            System.out.println("Нет решения");
        } catch (InputMismatchException e) {
            System.out.println("Неверные данные");
        }

    }
}
