interface A{

    /*String str="Hii"; //final and static 
    int num1=5;*/

    void show();
    void config();
}
abstract class B implements A{
    @Override
    public void show(){
        System.out.println("in B show");
    }
}
class C extends B{
    @Override
    public void config(){
        System.out.println("in C config");
    }
}
public class Interface{
    public static void main(String[] args) {
        A a=new C();
        a.show();
        a.config();
        // System.out.println(A.num1+" : "+A.str);
    }
}

/*
1️⃣ Which loads first? (Class Loading Order)
A) B extends A (A = class, B = subclass)
A ref = new B();


Loading order:

Class A loads first (parent)

Then class B loads (child)

✅ Always: Parent → Child

B) B implements A (A = interface, B = class)
A ref = new B();


Loading order:

Interface A loads first

Then class B loads

✅ Always: Interface → Implementing Class

2️⃣ Which constructor runs first? (Object creation)

When you do:

A ref = new B();


Execution order:

A constructor runs

Then B constructor runs

✅ Parent constructor → Child constructor

3️⃣ Where are they stored in memory?
🔹 Class / Abstract Class / Interface (Structure)

Stored in: Method Area (MetaSpace in JVM)
Contains:

Class bytecode

Method definitions

Static variables

Constant pool

Interface method signatures

So:

Interface body ✅ Method Area

Abstract class body ✅ Method Area

Normal class body ✅ Method Area

4️⃣ Where are variables & methods stored?
Member Type	Stored Where	Details
Instance variables	Heap (inside object)	Each object gets its own copy
Static variables	Method Area	One per class
Methods	Method Area	Shared by all objects
Local variables	Stack	Inside method call frame
*/