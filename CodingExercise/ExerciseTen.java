class PrinterTask implements Runnable{
    
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+":Running task "+ i);
        }
    }
}

public class ExerciseTen {
    public static void main(String[] args)throws InterruptedException {
        
        Runnable p=new PrinterTask();

        
        // Name them "Worker-1" and "Worker-2"
        // Runnable r1=new Runnable(p);
        Thread t1=new Thread(p,"Worker-1");
        
        // Runnable r2 =new Runnable(p);
        Thread t2=new Thread(p,"Worker-2");

        
        t1.start();
        t2.start();

        
        t1.join();
        t2.join();
    }
}
