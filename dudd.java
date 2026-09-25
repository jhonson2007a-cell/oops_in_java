public class dudd {
    
    public static void main(String[] args){
        int a[]=new int[6];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        System.out.println("Display the array:-");
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
        a[5]=100;
        System.out.println(a[5]);
    }
}
