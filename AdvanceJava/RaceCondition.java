class Counter {
    int count;
    public synchronized  int increment(){
        return count++;
    };
}
public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {

        Counter c1=new Counter();

        Runnable a=()-> {for(int i=0;i<100000;i++){
                        c1.increment();
                    }
                };
        Thread a1=new Thread(a);
        a1.start();
        Runnable b=()->{for(int i=0;i<100000;i++){
                        c1.increment();
                    }
                };
        Thread b1=new Thread(b);
        b1.start();
        a1.join();
        b1.join();
        System.out.println(c1.count);
    }
}