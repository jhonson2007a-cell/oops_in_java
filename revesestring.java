import java.util.Scanner;
public class revesestring {
    public static void main(String[] args) {
        System.out.println("enter the string by user..");
        Scanner s=new Scanner(System.in);
        String ch=s.nextLine();
        System.out.println("enter the string-");
        System.out.println("revser the string-");
        int n=ch.length();
        for(int i=n-1;i>=0;i--){
            System.out.print(ch.charAt(i));
        }
        s.close();
        
            }
}
