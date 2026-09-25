// class mythread extends Thread{
//     public void run(){
//         System.out.println("thread running...");
//     }
// }

// class DEMOthread {
//     public static void main(String[] args) {
//         mythread t1=new mythread();
//         t1.start();
//     }
// }

// class mythread extends Thread {
//     public void run(){
//         for(int i=1 ;i<=20;i++)
//             System.out.println("getname="+getName()+" value="+i);
//     }
// }

// class driver1{
//     public static void main(String[] args) {
//         System.out.println("IN MAIN....");
//         mythread t1=new mythread();
//         t1.setName("mythread");
//         t1.start();
//         for(int i=100;i<=120;i++) {
//             System.out.println("Finish Main="+i);
//         }
//         mythread t2=new mythread();
//         t2.setName("welcome");
//         t2.start();
//         System.out.println("finished main...");
//     }
// }

// class mythread extends Thread { 
//     public void run() { 
//         for(int i = 1; i <= 20; i++) {
//             // Fixed method calls and string concatenation
//             System.out.println("getname=" + getName() + " value=" + i); 
//         }
//     } 
// } 

// class driver1 { // Fixed invalid class name
//     public static void main(String[] args) { 
//         System.out.println("IN MAIN...."); 
//         mythread t1 = new mythread(); 
//         t1.setName("mythread"); // Fixed camelCase method name
//         t1.start(); 
//         for(int i = 100; i <= 120; i++) {
//             System.out.println("Finish Main...."); 
//         }
//     } 
// } 


// class mythread implements Runnable {
//     public void run() {
//         for (int i = 1; i <= 20; i++) {
//             System.out.println("hello from " + Thread.currentThread().getName());
//         }
//     }
// }

// class driver1 {
//     public static void main(String[] args) {
//         Runnable task = new mythread();
//         Thread t1 = new Thread(task);
//         t1.start();
//     }
// }

