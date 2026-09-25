import java.util.Scanner;
public class sumthree {
    public static void main(){
        System.out.println("enter the three number by user");
        Scanner num=new Scanner(System.in);
        System.out.print("\n enter the 1 number=");
        int num1=num.nextInt();
        System.out.print("\n enter the 2 number=");
        int num2=num.nextInt();
        System.out.print("\n enter the 3 number=");
        int num3=num.nextInt();
        int sum=num1+num2+num3;
        System.out.print("\n the sum of the three number ="+sum);
        num.close();
    }
}
