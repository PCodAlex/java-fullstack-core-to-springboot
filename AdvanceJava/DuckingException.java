class A{
    public void show() throws ClassNotFoundException{
        Class.forName("Animal");
    }
}
class B{
    public void show1() throws ClassNotFoundException{
        Class.forName("A");
        System.out.println("All ok in class B");
    }
}
public class DuckingException {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        try {
            b.show1();
            a.show();
        } catch (Exception e) {
            System.out.println("that class doesnot found | error : "+e);
        }
        
    }
}
