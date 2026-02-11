import java.util.Scanner;
class Laptop{
    static String os;
    int price;
    String brandName;//instance =>heap
    static int version;
    public Laptop(){ //default constructor
        // os="Windows";
        price=50000;
        brandName="Asus"; //local => in Laptop class whenever method is called stack stored in stack 
        System.out.println("in constructor");
    }
    static{
        os="Windows"; //✅ Set once ✅ Applies to all objects ✅ More efficient ✅ Clearly indicates it's class-wide configuration
        System.out.println("in static block");
        Scanner sc = new Scanner(System.in);
        version = sc.nextInt();  // logic-based initialization //stored in method area
    }
    public void print(){
        System.out.println(os +" : "+price+" : "+brandName+" : "+version);
    }

}
public class StaticBlock{
    public static void main(String[] args) throws ClassNotFoundException{
        Class.forName("Laptop");//stored in the method area 

        Laptop lap=new Laptop();//stored =>heap memory
        Laptop.os="IOs";
        lap.price=459999;
        lap.brandName="Apple";
        lap.print();

        Laptop lap2=new Laptop();
        // Laptop.os="IOs";
        lap2.price=59999;
        lap2.brandName="Hp";
        lap2.print();
        
    }
}

/*Initialization needs logic

Multiple statements are required

Exception handling is involved

Complex calculations are done */

/* Common value for all objects	 => static variable
Need to initialize once	         => static block
Initialization needs logic	     => static block
Each object has own value	     => instance variable
Object-level setup	             => constructor */

/*Stack frame is created for main() method ✅

NOT for the class itself ❌

Stack belongs to:

Threads

Method calls */