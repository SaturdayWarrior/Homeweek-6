package javaprogramme;

import java.util.Scanner;

public class Program6 {
    public static void area(){
        Scanner tata = new Scanner(System.in);
        System.out.println("Enter radius value in meter");
        double a = tata.nextDouble();
        double ans = (3.14*a*a);
        System.out.println("Area of the circle is "+ ans + "square meters");

    }
    public static void main(String[] args){
        area();
    }

}
