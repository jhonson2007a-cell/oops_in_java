import java.util.Scanner;
public class multpytable {
    public static void main(String[] args){
        System.out.print("enter number to write multiplication table...");
        Scanner num=new Scanner(System.in);
        System.out.print("\nenter the number=");
        int n=num.nextInt();
        int multi;
        for(int i=1;i<=10;i++){
            multi=n*i;
            System.out.println(n+" X "+i+" = "+multi);
        }
        num.close();
    }    
}
