import java.util.Scanner;
class pelindrone {
     public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = num.nextInt();

        int original = n;
        int d = 0, r;

        for (; n > 0; n = n / 10) {
            r = n % 10;
            d = d * 10 + r;
        }

        System.out.println("Reversed number = " + d);

        if (original == d)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        num.close();
    }
        
    }

