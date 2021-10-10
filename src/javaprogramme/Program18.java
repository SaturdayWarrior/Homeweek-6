package javaprogramme;

import java.util.Scanner;

public class Program18 {
    int a = 125;
    int b = 24;

    public static void main(String[] args) {
        newclass();


    }

    public static void newclass() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Input the second number: ");
        int num2  = scanner.nextInt();

        int sum = num1 + num2;
        int subtract = num1 - num2;
        int multiply = num1 * num2;
        int divide = num1 / num2;
        int mod = num1 % num2;

        System.out.println(sum);
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(mod);

    }
    }


