class harryted {
    public static void main(String[] args) {
        int a,b;
        final int c=100;
        a=10;
        b=20;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        a=b+c;
        //c=a+b; con not change c variable
        System.out.println("a now is="+a);
        System.out.println("c now is="+(c*2));
        
    }
}
