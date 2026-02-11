/*
class -- class -->extends
interface -- interface --> extends
interface -- class  --> implements 
*/

interface A{
    void show();
}
interface B{
    void be();
}
interface C extends A{
    void config();
}
class X implements B,C{
    @Override
    public void show(){
        System.out.println("in show");
    }
    @Override
    public void config(){
        System.out.println("in config");
    }
    @Override
    public void be(){
        System.out.println("be yourself!");
    }
}
public class MultiInterface{
    public static void main(String[] args) {
        A x=new X();
        x.show();
        C y=(C)x; //Downcasting (Narrowing)
        y.show();
        B z=(B)y; //Cross-casting between sibling interfaces
        z.be();
    }
}