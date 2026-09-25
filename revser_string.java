class revser_string {
    public static void main(String[] args) {
        String str="java program";
        System.out.println("string is:"+str);
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
