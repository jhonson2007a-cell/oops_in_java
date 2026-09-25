import java.util.Scanner;
public class vewol2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String ch = s.nextLine();

        int count = 0;

        for (int i = 0; i < ch.length(); i++) {
            char c = ch.charAt(i);

        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') 
                {
                count++;
            }
        }

        System.out.println("Number of vowels = " + count);

        s.close();
    }
}