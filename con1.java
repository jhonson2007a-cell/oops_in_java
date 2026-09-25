public class con1 {
    int a,b;
     con1(){
        System.out.println("object created...");
        a=10;
        b=20;
    }
    public static void main(String[] args) {
        con1 obj1= new con1();
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        con1 obj2=new con1();
        System.out.println(obj2.a);
        System.out.println(obj2.b);
    }
}
