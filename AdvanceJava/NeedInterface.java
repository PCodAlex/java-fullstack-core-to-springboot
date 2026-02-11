interface Computer{
    void code();
}
class Laptop implements Computer{
    @Override
    public void code(){
        System.out.println("coding in Laptop");
    }
}
class Desktop implements Computer{
    @Override
    public void code(){
        System.out.println("coding in Desktop");
    }
}
class Developer{
    public void developing(Computer comp){
        comp.code();
    }
}
public class NeedInterface{
    public static void main(String[] args) {
        Computer comp=new Desktop();
        Computer comp1=new Laptop();
        Developer dev=new Developer();
        dev.developing(comp);
        Developer dev1=new Developer();
        dev1.developing(comp1);
    }
}