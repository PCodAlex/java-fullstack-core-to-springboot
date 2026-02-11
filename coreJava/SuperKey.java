class A extends Object{
    public A(){
        System.out.println("in A");
    }
    public A(int n){
        this();
        System.out.println("in A with a number");
    }
}
class B extends A{
    public B(){
        //super();//A constructor can have ONLY ONE of these and it must be the FIRST statement: this() , super()
        super(5);
        System.out.println("in B");
    }
    public B(int n){
        this();
        System.out.println("in B with a number");
    }
}
public class SuperKey{
    public static void main(String[] args) {
        B b=new B(5);
        System.out.println(b);
    }
}

/*✅ super()

Calls parent class constructor

Used to initialize parent properties

Use when you want parent setup first

Example:

super(10);

************************************

✅ this()

Calls another constructor of the same class

Used for constructor chaining

Example:

this(5); */