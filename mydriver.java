class mydriver {
    public static void main(String[] args) {
        logic_add ob=new logic_add();
        ob.readdata();
        int add=ob.myadd();
        System.out.println("addition="+add);
        int prod=ob.myprod();
        System.out.println("multiplication="+prod);

    }
}
