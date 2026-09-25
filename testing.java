import java.io.*;

public class testing {
    public static void main(String[] args) throws IOException{
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter your name:-");
        String fn= ob.readLine();
        System.out.println("enter the your age:-");
        String sn= ob.readLine();

        System.out.println("your add is "+fn+sn);
       
    }
}
