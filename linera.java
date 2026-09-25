import java.util.Scanner;
class linera {
    public static void main(String[] args) {
        System.out.print("\nHow many element you have..");
        Scanner c =new Scanner(System.in);
        System.out.print("\nenter How many element-");
        int n=c.nextInt();
        int a[]=new int[n];
        System.out.print("\nenter "+n+" element for the array-");
        for(int i=0;i<n;i++){
            System.out.print("\nenter "+(i+1)+" element-");
            a[i]=c.nextInt();
        }
       /*  System.out.println("Display array ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+"  ");
        }*/
        System.out.print("\nenter the target=");
        int t=c.nextInt();
        int p=0;
        int j;
        for(j=0;j<=n-1;j++){
            if(a[j]==t){
                p=1;
                break;
            }}
        System.out.print("\nnumber of array"+ p);
            if(p==0) 
                System.out.print("\ncannot found");
            else
                System.out.print("\nelement found at a position="+(j+1)+" and index="+j);
        c.close();
        }

}
