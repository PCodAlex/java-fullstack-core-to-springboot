//Lambda Expression

/*
Verbose (in programming) means: printing extra, detailed information about what the program or JVM is doing.

Example:
java -verbose → shows detailed internal execution logs.

Short meaning:
 Verbose = very detailed output / more information than usual.
*/
@FunctionalInterface
interface Mobile {
    void gaming();
}
interface Laptop{
    void coding(String ide);
}
interface Calc{
    int add(int i,int j);
}
// class AsusPhn implements Mobile{
//     public void gaming(){
//         System.out.println("it can gaming");
//     }
// }
public class FunctionalInt {
    public static void main(String[] args) {
        Mobile phn=() -> System.out.println("it can gaming");
        // Mobile phn=new Mobile(){
        //     public void gaming(){
        //     System.out.println("it can gaming");
        //     }
        // };
        phn.gaming();
        Laptop lap= ide -> System.out.println("coding");
        lap.coding("vsCode");

        Calc a= (i,j) ->  i+j;//it takes as a function for that reason it loads in the runtime and it creates in the main file itself so it does not need any object to create
        // Calc a=new Calc(){
        //     public int add(int i,int j){
        //         return i+j;
        //     }
        // };
        System.out.println(a.add(10,20));
    }
}
