class X {

    public void show(){
        System.out.println("in X show");
    }
    class Y{

        public void config(){
            System.out.println("in Y config");
        }
        class Z{

            public void print(){
                System.out.println("in z print");
            }
        }
    }
}
public class InnerClass{
    public static void main(String[] args) {
        X x= new X();
        x.show();

        X.Y y=x.new Y();
        y.config();

        X.Y.Z z=y.new Z();
        z.print();

    }
}

/*
1. How many inner classes can we create?

✅ Unlimited
You can create as many inner classes as needed, at any nesting level.

2. Why do we use inner classes? (Use case)

Inner classes are used to:

Access private members of outer class

Improve encapsulation & readability

Group logically related classes

Hide helper classes from outside world

👉 Mainly for better design and tight coupling between related classes.

3. Why & when do we use static inner class?

Static inner class is also called Nested Static Class.

Use it when:

Inner class does not need outer class object

It only uses static data of outer class

Benefits:

No extra memory for outer object reference

Better performance

Example use:

class Outer {
    static class Inner {
        void show() { }
    }
}


Create like:

Outer.Inner obj = new Outer.Inner();

4. Why outer class cannot be static?

Because:

static means "belongs to a class, not object"

Top-level classes already belong to JVM class loader, so:
✅ Making them static is meaningless
❌ Java does not allow it

Static is only valid for:

Inner (nested) classes, methods, variables, blocks

5. Can abstract class have inner class?

✅ YES

Abstract class can contain:

Normal inner class

Static inner class

Abstract inner class

Example:

abstract class A {
    class Inner {
        void show() {}
    }
}

Quick Summary
Question	Answer

How many inner classes?	Unlimited
Why inner classes?	Encapsulation, grouping, access control
Static inner class?	When outer object not needed
Outer class static?	Not allowed (already static in nature)
Abstract class with inner class?	Yes, allowed
*/

/*
1. “Static inner class only uses static data of outer class” – what does that mean?

A static inner class has NO reference to outer object.

So it:
✅ Can access:

Static variables of outer class

Static methods of outer class

❌ Cannot access:

Non-static variables

Non-static methods

Example:

class Outer {
    int x = 10;
    static int y = 20;

    static class Inner {
        void show() {
            // System.out.println(x); ❌ ERROR
            System.out.println(y); // ✅ OK
        }
    }
}


Reason: No Outer.this exists inside static inner class.

2. What happens to inner class when Class.forName() is called?
Class.forName("Outer");


When this runs:

Only the Outer class is loaded and initialized

Inner classes are NOT loaded automatically

They are loaded only when:

They are referenced / used

For inner class:

Class.forName("Outer$Inner");


JVM internal name uses $.
*/