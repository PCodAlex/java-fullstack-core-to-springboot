class A{
    public void show(){
        System.out.println("in A show");
    }
    public void show1(){
        System.out.println("in A show1");
    }
}
class B extends A{
    @Override
    public void show(){
        System.out.println("in B show");
    }
    public void show2(){
        System.out.println("in B show2");
    }
}
public class Casting{
    public static void main(String[] args) {
        A a=new B(); 
        a.show();  // -->in B show
        a.show1(); // -->in A show1
        // a.show2();

        B b=(B)a;
        b.show();  // -->in B show
        b.show1(); // -->in A show1
        b.show2(); // -->in B show2
    }
}