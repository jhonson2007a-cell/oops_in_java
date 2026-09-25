import java.util.Scanner;
class string_pelin {
    public static void main(String[] args){
        Scanner c=new Scanner(System.in);
        
        System.out.print("Enter the string-");
        String str=c.nextLine();
        System.out.println("revser the string...");
        int n=str.length();
        int i;
        String restr="";
        for( i=n-1;i>=0;i--){
            restr=restr+str.charAt(i);
                   }   
         System.out.print(restr);                 
        if(str.contentEquals(restr)){
            System.out.println("\nstring is pelindrome==>"+str+"="+restr);
        }
        else{
            System.out.print("\nstring not a pelindrome ==>"+str+" = "+restr);
        }
        c.close();
    } 
}
