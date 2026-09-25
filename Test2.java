import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        System.out.println("enter the two numbers... ");
       Scanner num=new Scanner(System.in);
       int a=num.nextInt();
       int b=num.nextInt();
       int c=a+b;
       System.out.println("sum of the number ="+c); 
       num.close();
    }
}
