class Animal{
    final public void sound(){
        System.out.println("sound like an animal");
    }
}
final class Lion extends Animal{
    // public void sound(){  -->sound method is final so it cannot be override 
    //     System.out.println("sound like an animal");
    // }

    public void roar(){
        System.out.println("roar! roar!");
    }
}
// class Lioness extends Lion{  -->Lion class is final so it cannot be extendes 

// }
public class FinalKey{
    public static void main(String[] args) {
        final int num1=6;
        // num1=5; -->num1 variable is final so it cannot be changed 
        System.out.println(num1);
        Lion leon=new Lion();
        leon.roar();
    }
}