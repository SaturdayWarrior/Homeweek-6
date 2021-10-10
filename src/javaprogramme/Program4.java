package javaprogramme;

public class Program4 {

    static int x = 10;
    static int t = 20;
    int a = 30;
    int b = 40;

    void four(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Program4.x);
        System.out.println(Program4.t);

    }
    static void  var(){
        Program4 v = new Program4();
        System.out.println(x);
        System.out.println(t);
        System.out.println(v.a);
        System.out.println(v.b);

    }

    public static void main(String[] args) {
        Program4 t = new Program4();
        var();
        t.four();
    }

    }

