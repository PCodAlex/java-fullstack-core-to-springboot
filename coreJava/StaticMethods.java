class Mobile{
    String brndName; //instance varible
    int price;//instance variable
    static String category;//static variable

    public void show(){ //instance method
        System.out.println(brndName+" : "+price+" : "+category);
    }
    public static void show1(Mobile obj){ //static method
        System.out.println(obj.brndName+" : "+obj.price+" : "+category);//just because it is a static method we have to use it among associate class name but when we use it with the class name it gets confused which obj value it should take . to overcome this problem we have to pass the mentioned object or particular obj which reference varibales gone a work with this static method 
    }
}
public class StaticMethods{
    public static void main(String[] args) {
        Mobile phn=new Mobile();
        phn.brndName="Apple";
        phn.price=170000;
        Mobile.category="Phone";//static variable is a class member not an object member just because it is a same for all 

        phn.show();

        Mobile phn2=new Mobile();
        phn2.brndName="Samsung";
        phn2.price=130000;
        Mobile.category="SmartPhone";//static variable is a class member not an object member just because it is a same for all 

        phn2.show();

        Mobile phn3=new Mobile();
        phn3.brndName="Nokia";
        phn3.price=10000;
        Mobile.category="TelePhone";//static variable is a class member not an object member just because it is a same for all 

        phn3.show();

        System.out.println("*****************************");

        phn.show();
        phn2.show();
        phn3.show();

        System.out.println("*****************************");
        // Mobile.show(phn); it will not going to work just because show is a instance method not an static method

        Mobile.show1(phn);
        Mobile.show1(phn2);
        Mobile.show1(phn3);

    }
}