package javaprogramme;

public class Program5 {
    int x = 10;
    int y = 20;
    int a = 5;
    int b = 6;
    static int c = 7;
    static int d = 8;
    static int e = 9;
    static int f = 11;

    static int n = 30;
    static int m = 40;

    public static void main(String[] args){
        Program5 obj = new Program5();
        Program5 y = new Program5();
        Program5 z = new Program5();
        obj.addition(5,8);
        obj.division(7,8);
        obj.multiplication(10,20);
        obj.substraction(9,11);

        System.out.println(obj.addition(5,8));
        System.out.println(obj.division(7,8));
        System.out.println(obj.multiplication(10,20));
        System.out.println(obj.substraction(9,11));

    }
    public int addition (int a, int b ){
        int result = a+b;
        return result;

    }
    public int multiplication (int x, int y){
        int result1 = x*y;
        return result1;

    }
    public static int division(int c, int d){
        int result2 = c/d;
        Program5 y = new Program5();
        return result2;

    }
    public static int substraction(int e, int f){
        Program5 z = new Program5();
        int result3 = e-f;
        return result3;
    }



}
