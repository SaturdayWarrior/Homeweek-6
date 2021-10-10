package javaprogramme;

import java.util.Scanner;

public class Program9 {
    public static void vol(){
        String uppStr;
        Scanner bar = new Scanner(System.in);
        System.out.println("Enter Uppercase Letter to convert =  " );
        uppStr = bar.nextLine();

        String uppStr2  = uppStr.toLowerCase();
        System.out.println("The Lowercase Letter = "+ uppStr2);
    }

    public static void main(String[] args) {
        vol();
    }
}
