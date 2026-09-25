import java.util.Scanner;
class logic_add {
    int a,b;
   //private int a,b;  //another class cannot access the integer & methods...
    void readdata(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the 1st number=");
        a=s.nextInt();
        System.out.println("Enter the 2rd number=");
        b=s.nextInt();
        System.out.println("the 1st number="+a);
        System.out.println("the 2rd number="+b);
        s.close();
    }
    int myadd(){
        return(a+b);
    }
    int myprod(){
        return(a*b);
    }
}
