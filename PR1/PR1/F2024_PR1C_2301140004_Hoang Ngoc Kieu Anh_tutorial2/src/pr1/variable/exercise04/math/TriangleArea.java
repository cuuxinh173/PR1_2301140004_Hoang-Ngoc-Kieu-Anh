package pr1.variable.exercise04.math;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three points for a triangle:");
        double x1= input.nextDouble();
        double y1= input.nextDouble();
        double x2= input.nextDouble();
        double y2= input.nextDouble();
        double x3= input.nextDouble();
        double y3= input.nextDouble();
        double side1;
        side1= Math.pow(((Math.pow(x1,2)) + (Math.pow(y1,2))),0.5);
        double side2 ;
        side2= Math.pow(((Math.pow(x2,2)) + (Math.pow(y2,2))),0.5);
        double side3;
        side3= Math.pow(((Math.pow(x3,2)) + (Math.pow(y3,2))),0.5);
        double s;
        s=(side1 + side2 + side3) / 2;
        double P;
        P= Math.pow((s*(s-side1)*(s-side2)*(s-side3)),0.5);
        System.out.println("The area of the triangle is : "+P);
    }
}
