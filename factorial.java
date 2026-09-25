import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        System.out.print("enter the number for find factorial..");
        Scanner num=new Scanner(System.in);
        int number=num.nextInt();
        int fact=1;
        for(int i=1;i<=number;i++){
            
            
            
            fact=fact*i;
                }
        System.out.print("\nfactorial ="+ fact);
        num.close();
    }
}
