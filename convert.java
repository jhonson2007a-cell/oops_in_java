import java.util.Scanner;
public class convert {
    public static void main(String[] args) {
        Scanner km=new Scanner(System.in);
        System.out.print("\nenter the kilometer to covert into miles=");
        float kilometer=km.nextFloat();
        float miles=kilometer/0.621f;
        System.out.print("kilometre is convert :-"+kilometer+" into mile "+miles);
        km.close();
    }
}
