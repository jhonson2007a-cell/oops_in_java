import java.util.Scanner;
class box {
    int h,b,l;
    void readdata(){
        System.out.println("enter the length of the box..");
        Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
        System.out.println("enter the breadth of the box..");
        b=sc.nextInt();
        System.out.println("enter the heigth of the box..");
        h=sc.nextInt();
        sc.close();
    }
    void showvolume()
    {
        System.out.println("length="+l);
        System.out.println("breadth="+b);
        System.out.println("heigth="+h);
        System.out.println("volume="+(b*h*l));

    }
    void showarea(){
        System.out.println("Area="+(2*((l*h)+(b*h)+(b*l))));
    }
    public static void main(String[] args) {
        box b1= new box();
        b1.readdata();
        b1.showvolume();
        
    }
}
