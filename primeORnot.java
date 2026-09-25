import java.util.Scanner;
public class primeORnot {
    public static void main(String[] args) {
        System.out.println("enter the the number to find prime or not..");
        Scanner obj=new Scanner(System.in);
        System.out.print("\nenter the number:-");
        int a=obj.nextInt();
        int count=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                count ++;
            }
        }
        if(count==2){
            System.out.print("\nthe number is prime..");
        }
        else{
            System.out.print("\n not a prime number");
        }
        obj.close();
    }
}
