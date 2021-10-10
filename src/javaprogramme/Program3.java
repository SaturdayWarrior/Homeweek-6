package javaprogramme;

public class Program3 {
   int x = 10;
   static int y = 20;

   void tree(){
       System.out.println(x);
       System.out.println(Program3.y);
    }
    static void pro(){
       Program3 obj = new Program3();
        System.out.println(y);
        System.out.println(obj.x);

    }

    public static void main(String[] args) {
        Program3 t = new Program3();
        t.tree();
        pro();

    }



}
