 import java.util.Scanner;
public class srevesearr {
   

    public static void main(String[] args) {
        System.out.println("enter the string by user..");
        Scanner s=new Scanner(System.in);
        String ch=s.nextLine();
        System.out.println("enter the string-"+ch);
        
        char msg[]=ch.toCharArray();
        for(char n:msg)
            System.out.print(n);
        
        System.out.println("revser the string-");
        for(int i=msg.length-1;i>=0;i--)
            System.out.print(msg[i]);
        s.close();
                    }
}

