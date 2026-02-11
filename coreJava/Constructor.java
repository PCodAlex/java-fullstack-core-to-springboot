class Human{
    int age;
    String name;
    public Human(){ //default constructor
        System.out.println("in the constructor");
        age=23;
        name="Akash Samanta";
    }
    public Human(int age,String name){//parameterized Conartuctor
        this.age=age;
        this.name=name;
    }
    public void print(){
        System.out.println(name +" : "+age);
    }
}

public class Constructor{
    public static void main(String[] args) {
        Human man=new Human();
        man.print();
        Human woMan=new Human(52,"Krishna Samanta");
        woMan.print();
    }
}

/*Camel Casting

class and interfaces => Calc, Runable
varibale and method => marks , show()
constants => PIE , BRAND

*/