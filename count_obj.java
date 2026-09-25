class count_obj {
    public static int countobj=0;
    {
        countobj++;
    }
    public count_obj(){}
    public count_obj(String str){}
    public static int getcountobj()
    {
        return countobj;
    }
    public static void main(String[] args) {
        count_obj countobj1 = new count_obj();
        count_obj countobj2 = new count_obj("Hello");
        count_obj countobj3 = new count_obj();
        System.out.println("total create the object=" + getcountobj());

    }

}
