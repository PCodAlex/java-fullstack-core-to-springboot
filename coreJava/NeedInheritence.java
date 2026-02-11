class Calc{//root , parent 
    private int num1;
    private int num2;
    public Calc(){
        num1=1;
        num2=1;
    }
    public void setValue(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    protected  int getNum1(){
        return num1;
    }
    protected  int getNum2(){
        return num2;
    }
    public void sum(){
        System.out.println("sum : "+(num1+num2));
    }
    public void sub(){
        System.out.println("sub : "+(num1-num2));
    }
}

//Calc => AdvCalc is a relationship
// Calc -> AdvCalc single level inheritence
class AdvCalc extends Calc{ //sub , Child ,
    
    public void mul(){
        System.out.println("mul : "+(getNum1()*getNum2()));
    }
    public void div(){
        System.out.println("div : "+(getNum1()/getNum2()));
    }
}

// Calc -> AdvCalc -> SciCalc single level inheritence
class SciCalc extends AdvCalc{
    public void mod(){
        System.out.println("mod :"+(getNum1()%getNum2()));
    }
    public void power(){
        System.out.println("power :"+(Math.pow(getNum1(),getNum2())));
    }
}
public class NeedInheritence{
    public static void main(String[] args) {
        // Calc cal=new Calc();
        // cal.setValue(6, 3);
        // cal.sum();
        // cal.sub();

        // AdvCalc adCal=new AdvCalc();
        // adCal.setValue(6, 3);
        // adCal.mul();//mul : 18
        // adCal.div();//div : 2
        // adCal.sub();//sub : 3
        // adCal.sum();//sum : 9

        SciCalc sciCal=new SciCalc();
        sciCal.setValue(6, 3);
        sciCal.mod();//mod :0
        sciCal.power();//power :216.0
        sciCal.mul();//mul : 18
        sciCal.div();//div : 2
        sciCal.sub();//sub : 3
        sciCal.sum();//sum : 9


    }
}

/*same code called as a redundency which is take as a crime */

/*Ambiguity Problem in Java (very short)

Ambiguity occurs when Java can’t decide which method or variable to use because multiple options match.

It mainly happens in:

Multiple inheritance of classes (which Java avoids)

Method overloading with same signature

Interfaces with same default methods

Example:

class A { default void show(){} }
class B { default void show(){} }
class C extends A,B { public void ***{ show()}} --> class c cant decide to choose a method 


interface A { default void show(){} }
interface B { default void show(){} }

class C implements A, B { }   // ❌ Ambiguity: which show()?


✅ Java solves this by:

Not allowing multiple class inheritance

Forcing method override to remove confusion. */