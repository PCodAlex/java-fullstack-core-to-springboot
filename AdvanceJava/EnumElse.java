enum Status{
    Running ,Failed , Success,Stop;
}
public class EnumElse{
    public static void main(String[] args) {
        Status s=Status.Stop;
        switch (s) {
            case Running -> System.out.println("it is running ");
            case Failed -> System.out.println("it is failed to run");
            case Success -> System.out.println("it runs successfully");
            default -> System.out.println("it is stopped");
        }
        // switch (s) {
        //     case Running:
        //         System.out.println("it is running ");
        //         break;
        //     case Failed:
        //         System.out.println("it is failed to run");
        //         break;
        //     case Success:
        //         System.out.println("it runs successfully");
        //         break;
        //     default:
        //         System.out.println("it is stopped");
        //         break;
        // }
        //if(s==Status.Running){
        //     System.out.println("it is running ");
        // }
        // else if(s==Status.Failed){
        //     System.out.println("it is failed to run");
        // }
        // else if(s==Status.Success){
        //     System.out.println("it runs successfully");
        // }
        // else {
        //     System.out.println("it is stopped");
        // }
    }
}