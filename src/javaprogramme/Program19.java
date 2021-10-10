package javaprogramme;

import java.util.Scanner;

public class Program19 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter Letter in Uppercase: ");
        String a1 = name.nextLine();
        a1 = a1.toLowerCase();
        System.out.println("Letter is convert in Lowercase: " + a1);

    }
}
