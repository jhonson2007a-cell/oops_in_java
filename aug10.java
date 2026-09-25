
class aug10 {
    int a,b;
    /*  aug10(){
        System.out.println("object created...");
        a=10;
        b=20;
    }*/
   aug10(int x){
    a=b=x;
   }
    aug10(int x,int y){
        a=x;
        b=y;
    }
    public static void main(String[] args) {
        aug10 obj1= new aug10(10,20);
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        aug10 obj2=new aug10(100,200);
        System.out.println(obj2.a);
        System.out.println(obj2.b);
        aug10 obj3=new aug10(1000);
        System.out.println(obj3.a);
        System.out.println(obj3.b);
        aug10 obj4=new aug10();
    }
}
