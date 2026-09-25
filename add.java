import java.util.Scanner;
class add
{
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the first number:");
int a=sc.nextInt();
System.out.println("enter the second number:");
int b=sc.nextInt();
System.out.println("sum of "+a+" and "+b+"="+(a+b)+"bye");
    sc.close();
}
}