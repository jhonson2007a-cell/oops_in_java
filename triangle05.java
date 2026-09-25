import java.util.Scanner;
class triangle05 {
    float s1,s2,s3;
    void readdata(){
        Scanner tri=new Scanner(System.in);
        System.out.println("enter the 1st side:-");
        s1=tri.nextFloat();
        System.out.println("enter the 2rd side:-");
        s2=tri.nextFloat();
        System.out.println("enter the 3rd side:-");
        s3=tri.nextFloat();
        tri.close();
    }
    void showdata(){
        System.out.println("the 3 side are:-"+s1+"\t"+s2+"\t"+s3);
    }
    void calarea(){
        float s;
        s=(s1+s2+s3)/2;
        double area;
        area=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        System.out.println("area of triangle="+area);
    
    }
    public static void main(String[] args){
        triangle05 ob=new triangle05();
        ob.readdata();
        ob.showdata();
        ob.calarea();
    }
}
