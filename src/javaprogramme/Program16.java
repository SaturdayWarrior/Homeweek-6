package javaprogramme;

import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter one binary number: ");
        String b1 = scan.nextLine();
        System.out.println("Enter second binary number: ");
        String b2 = scan.nextLine();

        Integer integer1  = Integer.parseInt(b1,2);
        Integer integer2 = Integer.parseInt(b2,2);

        Integer output = integer1+integer2;

        System.out.println("The sum of two binary numbers is " + Integer.toBinaryString(output));

        }


    }


