
// import java.util.Arrays;

enum Status{
    Running ,Failed , Success,Stop;//all that are constant values(objects)
    //public static final Status Running = new Status();
    /*
    So each enum constant is:

    A public static final object

    Created only once (Singleton)

    That’s why they behave like objects.
        
    */
}

/*
final class Status extends Enum<Status> {
    public static final Status Running = new Status();
    public static final Status Failed = new Status();
    public static final Status Success = new Status();
    public static final Status Stop = new Status();
}
    Keyword	Real meaning
    public	Anyone can access it
    static	Only one shared instance exists
    final	That reference cannot be changed
*/
public class Enum{
    public static void main(String[] args) {
        //enum-->enumeration (enum for short)
        //enum (enumeration) is a special Java type used to represent a fixed set of constant values.

        Status s[]=Status.values(); //--> An array of all enum constants in the order declared. [Running, Failed, Success, Stop]
        // System.out.println(Arrays.toString(s));
        for(Status ss:s){
            System.out.println(ss+" : "+ss.ordinal());//--> Position number of the enum constant (starting from 0)
        }

        Status s1=Status.Running;//Status is a data type (like class) ***** Running is a constant object inside that type
        //Status.Running.toString() → "Running"
        /*
        Status      → type
        Running     → value (object)
         */
        System.out.println(s1);

    }
}