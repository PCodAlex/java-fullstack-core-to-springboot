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
class C extends A{
    @Override
    public void show(){
        System.out.println("in C show");
    }   
}
public class Dispatch{
    public static void main(String[] args) {
        A a=new C();
        a.show();

        /*
        ✅ Reference type decides WHAT methods are accessible
        ✅ Object type decides WHICH version is executed
        */

        A b=new B();
        b.show();
    }
}

/*
Dynamic Method Dispatch (short):

Dynamic Method Dispatch is a feature in Java where the method that gets executed is decided at runtime based on the actual object, not the reference type.

It happens when:

A superclass reference points to a subclass object, and

The method is overridden.

Key rule:

Reference type decides accessibility, but object type decides execution.

Example:

A a = new B();
a.show();   // Calls B's show() at runtime


This is also called runtime polymorphism.
*/