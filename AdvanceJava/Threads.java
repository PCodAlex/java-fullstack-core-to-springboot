class A extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("hii");
            try {
                A.sleep(5);
                System.out.println("x");
            } catch (InterruptedException e) {
                
                // e.printStackTrace();
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("hellow");
        }
    }
}
public class Threads {
    public static void main(String[] args) {
        A a=new A();
        System.err.println(a.getPriority());
        B b=new B();
        b.setPriority(10);
        a.start();
        b.start();
    }
}
