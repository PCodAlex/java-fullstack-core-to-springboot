abstract class A{ //abstract class
    public abstract void show();
    public abstract void config();
    public void show1(){//abstract class can hold both abstract and concreate method 
        System.out.println("in A show1");
    }
}
abstract class B extends A{ //abstract class
    @Override
    public void show(){ //if a class cannot override all the abstract method declare in the parent class it becomes abstract class
        System.out.println("in B show");
    }
}
class C extends B{ //concrete class
    @Override
    public void config(){
        System.out.println("in C config");
    }
}
public class AbsClass{
    public static void main(String[] args) {
        A a=new C(); // you cannot use a constructor or create an object of abstract class but u can the use as a reference type
        a.show(); //in B show
        a.config(); //in C config
        a.show1(); //in A show1
    }
}

/*
ChatGPT said:
Why we use abstract in Java (very short & clear)

1. Abstract Class

Used when you want a base blueprint that should not be directly created.

Purpose: to provide common structure + force rules for child classes.

You cannot create objects of an abstract class.

2. Abstract Method

A method without body (no implementation).

Purpose: to force subclasses to implement their own version.

Where & when are abstract methods loaded?

Abstract methods are loaded into memory with the class like normal methods.

They are stored in the method area (JVM metaspace) as method signatures (no code body).

Since they have no body, no executable bytecode exists for them.

Key idea

Abstract methods are:

Declared in parent class

Implemented in child class

JVM calls the child’s implementation at runtime (dynamic binding).
*/

/*********************************************************************** */

/*
3. Can we call Class.forName() on abstract class?

✅ YES — absolutely.

Class.forName() only loads the class, it does NOT create object.

So:

Class.forName("com.demo.AbstractClass");


Works fine.

But:

new AbstractClass(); // ❌ NOT allowed

*/