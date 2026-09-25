import java.util.Scanner;
class triangle {
    float h,b;
    void readdata()
    {
        System.out.println("enter the heigth and base of triangle...");
        Scanner tri=new Scanner(System.in);
        System.out.print("\nenter the heigth:-");
        h=tri.nextFloat();
        System.out.print("\nenter the base:-");
        b=tri.nextFloat();
        tri.close();

    }
    void showarea(){
        System.out.println("the hiegth="+h );
        System.out.println("the base="+b );
         System.out.println("the area of triangle="+((h*b)/2) );

    }
    public static void main(String[] args) {
        triangle t1= new triangle();
        t1.readdata();
        t1.showarea();
    
    }
}
