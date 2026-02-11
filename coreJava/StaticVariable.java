class Mobile{
    String brndName;//instance varibale
    int price;//instance varibale
    static String category;//static variable

    public void show(){ //instance method
        System.out.println(brndName+" : "+price+" : "+category);
    }
}
public class StaticVariable{
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

    }
}