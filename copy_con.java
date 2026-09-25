class copy_con {
    int a,b;
    copy_con()
    {
        a=10;
        b=20;
        System.out.println("no argument constructor called...");
    }
    copy_con(int x,int y){
        a=x;
        b=y;
        System.out.println("two argument constructor called");

    }
    copy_con(copy_con ob){
        a=ob.a;
        b=ob.b;
        System.out.println("copy constructor called");

    }
            public static void main(String[] args){
            copy_con ob1=new copy_con();
            System.out.println("object1 data" );
            System.out.println(ob1.a);
            System.out.println(ob1.b);
            copy_con ob2=new copy_con(1000,2000);
            System.out.println("object2 data");
            System.out.println(ob2.a);
            System.out.println(ob2.b);
            copy_con ob3=new copy_con(ob2);
            System.out.println("object3 data");
            System.out.println(ob3.a);
            System.out.println(ob3.b);
            copy_con ob4=ob1;
            System.out.println("object4 data");
            System.out.println(ob4.a);
            System.out.println(ob4.b);

           
        }
    }

