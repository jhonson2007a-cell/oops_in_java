import java.util.Scanner;

public class mark {
    public static void main(String [] args){
        System.out.printf("enter the marks of students:-");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks-");
        System.out.println("enter the maths marks-");
        int maths=sc.nextInt();
        System.out.println("enter the hindi marks-");    
        int hindi=sc.nextInt();
        System.out.println("enter the science marks-");
        int science=sc.nextInt();
        System.out.println("enter the so.science marks-");
        int soscience=sc.nextInt();
        System.out.println("enter the english marks-");
        int english=sc.nextInt();
        int sum_mark= maths+hindi+science+soscience+english;
        float percentage=(sum_mark/500.0f)*100;
        System.out.println("the total marks-"+sum_mark);
        System.out.println("the percentage of the marks-"+percentage+"%");
        sc.close();
    }
}
