import java.util.Scanner;
class dia_arr {
    public static void main(String[] args) {
        int a[][]=new int[2][2];
        System.out.println("enter the value");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                 a[i][j]=sc.nextInt();
            }
        }
         for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
