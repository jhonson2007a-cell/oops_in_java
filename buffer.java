import java.io.*;

class buffer {
    public static void main(String[] args) throws IOException{
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter your name:-");
        String name= ob.readLine();
        System.out.println("enter the your age:-");
        int age;
        String n=ob.readLine();
        age=Integer.parseInt(n);
        System.out.println("your name is "+name);
        System.out.println("your age is "+age);

    }
}
