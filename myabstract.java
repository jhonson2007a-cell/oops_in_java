abstract class myabstract {
    abstract void show();
    void disp(){
    System.out.println("i am dis of myabstract");
    }
}

class derabstract extends myabstract{
    void show(){
        System.out.println("Show of derabstract...");
    }
    void myprint(){
        System.out.println("Hello all...");
    }
}

class drive {
   public static void main(String[] args) {
    derabstract ob=new derabstract();
    ob.show();
    ob.disp();
    ob.myprint();
   } 
}
