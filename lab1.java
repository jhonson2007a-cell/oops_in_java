import java.util.Scanner;
class lab1 {
     public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = num.nextInt();

        int original = n;
        int d = 0;
        int r;

        while(n>0){
            r = n % 10;
            d = d * 10 + r;
            n=n/10;
        }

        System.out.println("Reversed number = " + d);

        if (original == d)
            System.out.println("Pelindrome....");
        else
            System.out.println("Not Pelindrome....");
        num.close();
    }
}
