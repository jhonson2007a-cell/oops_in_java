class mythread extends Thread{
    public void run(){
        System.out.println("thread running...");
    }
}

class DEMOthread {
    public static void main(String[] args) {
        mythread t1=new mythread();
        t1.start();
    }
}

