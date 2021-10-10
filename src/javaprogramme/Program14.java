package javaprogramme;

import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        final double x = 5.6;
        final double y = 8.5;

        Scanner a = new Scanner(System.in);
        System.out.println("Enter Width of the rectangle in cm = ");
        double perimeter = a.nextDouble();
        System.out.println("Enter Height of the rectangle in cm = ");
        double area = a.nextDouble();

        System.out.println("The area of the rectangle is " + x*y + " sq cm" );
        System.out.println("The permieter of the rectangle is " + 2*(x+y) + " cm");

    }

}
