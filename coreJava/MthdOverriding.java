class A{
    public void show(){
        System.out.println("in A show");
    }
}
class B extends A{
    @Override
    public void show(){
        System.out.println("in B show");
    }
}
public class MthdOverriding{
    public static void main(String[]args){
        A a=new A();
        a.show();
        B b=new B();
        b.show();
    }
}