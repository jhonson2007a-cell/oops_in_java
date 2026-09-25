import java.util.Scanner;
public class even {
        public static void main(String[] args) {
        System.out.print("enter the number to find odd and even..");
        Scanner num=new Scanner(System.in);
        int n=num.nextInt();
        if(n%2==0){
            System.out.print("\nthe number is even..");
            }
        else{
            System.out.print("\nthe number is an odd..");
        }  
        num.close();  
    }
}