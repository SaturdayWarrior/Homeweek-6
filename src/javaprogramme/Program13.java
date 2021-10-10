package javaprogramme;

import java.util.Scanner;

public class Program13 {
    public void pro(){
        int one  = 5;
        int two = 10;
        int three = 30;
    }
    public static double avr(int one, int two, int three)
    {
        return (one + two + three) / 3;


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int one = scan.nextInt();
        System.out.print("Enter the second number: ");
        int two = scan.nextInt();
        System.out.print("Enter the third number: ");
        int three = scan.nextInt();
        System.out.print("The average of entered numbers is: " + avr(one, two, three) );
    }
}
