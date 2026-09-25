import java.util.Scanner;
class switch_case{
    public static void main(String[] arr){
        
        System.out.println("enter the number=");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("wait a sec..");
        switch (n) {
            case 0:
                System.out.println("sunday");
                break;
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("teusday");
                break;
            case 3:
                System.out.println("wednsday");
                break;
            case 4:
                System.out.println("thusrday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("stataday");
                break;
            
            default:
                break;

        }
        sc.close();
    }
}
