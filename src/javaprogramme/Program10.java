package javaprogramme;

import java.util.Scanner;

public class Program10 {
    static void math(){
        Scanner ma =new Scanner(System.in);
        System.out.print("Input a number: ");
        int num1 = ma.nextInt();
        for (int a=0; a<=10; a++){
            System.out.println(num1 +" x " + a + " = " + num1*a);
        }
    }

    public static void main(String[] args) {
        math();
    }
}