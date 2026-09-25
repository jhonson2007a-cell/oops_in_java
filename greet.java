import java.util.Scanner;
public class greet {
    public static void main(){
        System.out.printf("enter the name by user...");
        Scanner name=new Scanner(System.in);
        System.out.print("\n enter the name:-");
        String user_name=name.next();
        System.out.print("\nHello "+user_name+" have a good day..");
        name.close();
    }

    
}
