abstract class G{
    public abstract void print();
}
class H extends G{
    @Override
    public void print(){
        System.out.println("hello world");
    }
}
public class AnnoInerCls{
    public static void main(String[] args) {
        G g=new G(){ //class AnnoInerCls$1 extends G [only for annonymous inner class]  -->G g = new AnnoInerCls$1();
            @Override
            public void print(){
            System.out.println("hello world"); //hello world
            }
        };
        g.print();

        H h=new H(){
            @Override
            public void print(){
            System.out.println("namaste prithvi");//namaste prithvi
            }
        };
        h.print();
    }
}

/* 
1. Does every inner class extend the outer class?

❌ NO. Inner classes do NOT automatically extend the outer class.

There are two different relationships:

Normal inner class
class Outer {
   class Inner { }
}


Here:

Inner is just a member of Outer

It does NOT extend Outer

It only holds an implicit reference: Outer.this

Anonymous inner class
G g = new G() { ... };


This anonymous class:
✅ Extends or implements the type you instantiate, NOT the enclosing class.

So this:

class AnnoInerCls$1 extends G


is possible because:

You wrote: new G() { ... }

So compiler says: “Create a subclass of G”

It has NOTHING to do with AnnoInerCls inheritance-wise

AnnoInerCls is only the enclosing scope, not the parent class.

2. Why no outerObj.new Inner() syntax for anonymous inner class?

Because anonymous inner class is created differently by the compiler.

For normal inner class:

Outer.Inner i = outerObj.new Inner();


Because Inner is a real named member class.

But for anonymous inner class:

G g = new G() { ... };


You are NOT referring to a named inner class.
You are creating a new subclass on the spot.

The compiler secretly converts it to:

class AnnoInerCls$1 extends G {
   public void print() { ... }
}


And also secretly does:

G g = new AnnoInerCls$1( hidden reference to outer if needed );


So:

You don’t see AnnoInerCls$1

You don’t see .new

But JVM still handles the enclosing reference internally.

If the anonymous class accesses members of AnnoInerCls, the compiler automatically passes a hidden reference to the outer object.

Key Difference Table
Normal Inner Class	Anonymous Inner Class
Has name	No name
Created with .new syntax	Created directly with new ParentType()
Member of outer class	Temporary subclass of given type
Must follow outer-instance rule	Compiler handles it automatically
What REALLY happens

Your code:

G g = new G() {
   public void print() { System.out.println("hello"); }
};


Compiler does roughly:

class AnnoInerCls$1 extends G {
    public void print() {
        System.out.println("hello");
    }
}
G g = new AnnoInerCls$1();


So:
✅ Abstract rule not broken
✅ No outer object syntax needed
✅ Because it’s a subclass, not a member inner class

Final Mental Model

Anonymous inner class is NOT a child of the outer class.
It is a child of the type you are instantiating.

Outer class is just the place where it is written.*/