class A implements Runnable{
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println("Hii");
        }
    }
}
class B implements Runnable{
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println("Hellow");
        }
    }
}
public class RunnableInterface {
    public static void main(String[] args) {
        /*A a=new A();
        a.start();*/
        
        /*Runnable a=new A();
        Thread a1=new Thread(a);
        a1.start();*/

        /*Runnable a=new Runnable(){
            public void run(){
                for(int i=0;i<50;i++){
                    System.out.println("Hii");
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        
                        // e.printStackTrace();
                        System.out.println("something went wrong");
                    }
                }
            }
        };*/

        Runnable a=()-> {for(int i=0;i<50;i++){
                    System.out.println("Hii");
                    try {Thread.sleep(1);}catch (InterruptedException e) {System.out.println("something went wrong");};
                    }
                };
        Thread a1=new Thread(a);
        a1.start();


        /*B b=new B();
        b.start();*/

        /*Runnable b=new B();
        Thread b1=new Thread(b);
        b1.start();*/

        /*Runnable b=new Runnable(){
            public void run(){
                for(int i=0;i<50;i++){
                    System.out.println("Hellow");
                }
            }
        };*/

        Runnable b=()->{for(int i=0;i<50;i++){
                    System.out.println("Hellow");
                    }
                };
        Thread b1=new Thread(b);
        b1.start();
    }
}
