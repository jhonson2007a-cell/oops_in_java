
class car {
    String model="Honda";
    void drive()
    {
        //model="Honda";
        System.out.println(model+" car is driving....");
    }
    public static void main(String[] args) {
        car mycar=new car();
        mycar.drive();
        mycar.model=new String("jaguaar");
        mycar.drive();

    }
}
