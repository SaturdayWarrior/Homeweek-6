package javaprogramme;

public class Program15 {
    public static void main(String[] args) {
        int x , y;
         x = 10;
         y = 20;
        System.out.println("Before swapping : a , b =  " +x+", "+  y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping  : a , b =  " +x+", "+   y);
    }
}
