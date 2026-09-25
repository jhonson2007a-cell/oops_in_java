import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        System.out.println("enter the numbers by user:-");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number=");
        int a=sc.nextInt();
        System.out.println("enter the scoend number=");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("the sum of the numbers "+"="+sum);
        sc.close();
    }
}
