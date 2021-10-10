package javaprogramme;

import java.util.Scanner;

public class Program7 {
    static void temperature() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature degree in Fahrenheit");
        double a = scanner.nextDouble();
        double ans = ((a - 32) * 5 / 9);
        System.out.println("The converted value of given temperature in degree Celsius is " + ans);

    }

    public static void main(String[] args) {
        temperature();
    }
}