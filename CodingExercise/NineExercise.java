
class InvalidAgeException extends Exception{
    // private String message=null;
    public InvalidAgeException(String message){
        super(message); //this will send the message to the super class and it will return the message as well 
        // this.message=message;
    }
    // public String getMessage(){
    //     return message;
    // }
}

public class NineExercise {
    
    public static void checkAge(int age) throws InvalidAgeException { //throws only declares possibility;
        
        if(age<18){
            throw new InvalidAgeException("Age must be 18 or older");//throw new InvalidAgeException() actually creates and throws the exception object.**
        }
        else{
            System.out.println("Access granted");
        }
    }
    
    public static void main(String[] args) {
        
        try{
            checkAge(16);
        }catch(InvalidAgeException e){
            System.out.println("Exception caught: "+e.getMessage());
        }
        try{
            checkAge(21);
        }catch(InvalidAgeException e){
            System.out.println("Exception caught: "+e.getMessage());
        }
        
    }

}

