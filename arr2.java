import java.util.Scanner;
class arr2 {
    public static void main(String[] args) {
        System.out.println("How many element you have..");
        Scanner c =new Scanner(System.in);
        System.out.print("\nenter How many element-");
        int n=c.nextInt();
        int a[]=new int[n];
        System.out.print("enter "+n+" element for the array-\n");
        for(int i=0;i<a.length;i++){
            System.out.print("enter "+(i+1)+" element-\n");
            a[i]=c.nextInt();
        }
        System.out.println("Display array ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"  ");
        }
        c.close();
    }
}
