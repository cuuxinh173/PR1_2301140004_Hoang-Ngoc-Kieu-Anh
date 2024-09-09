package pr1.variable.exercise02.math;
import java.util.Scanner;

public class RunwayLength {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter v:");
        double v = input.nextDouble();
        System.out.println("Enter a:");
        double a = input.nextDouble();
        double x;
        x = Math.pow(v, 2) / (2 * a);
        System.out.println("x=" + x);
    }
}
