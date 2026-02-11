
interface Machine{
    String start();
}


// - Implements Machine interface
abstract class Appliance implements Machine{
    // private String name;
    // public Appliance(String name){
    //     this.name=name;
    // }
}



// - Extends Appliance
class Fan extends Appliance{
    // public Fan(String name) {
    //     super(name);
    // }
    @Override
    public String start(){
        return "Fan is running";
    }
}



// - Extends Appliance
class WashingMachine extends Appliance{
    // public WashingMachine(String name) {
    //     super(name);
    // }
    @Override
    public String start(){
        return "Washing Machine is operating";
    }
}


public class ExerciseEight {
    public static void main(String[] args) {
       
        Machine fan=new Fan();
        System.out.println(fan.start());
        Machine washer=new WashingMachine();
        System.out.println(washer.start());
        
    }
} 
    

