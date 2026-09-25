
class array1 {
public static void main(String[] args) {
    int a[]=new int [5];
    for(int i=0;i<a.length;i++)
        a[i]=i*2;
        System.out.println("Display array");
        //for(int i=0;i<a.length;i++)
          //  System.out.println(a[i]);
        for(int i:a)
            System.out.println(i);

}    
}
