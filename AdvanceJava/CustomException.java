class MyException extends ArithmeticException{
    public MyException(String str){
        super(str);
    }
}
public class CustomException {
    public static void main(String[] args) {
        int i=19;
        int j=0;
        try {
            j=18/i;
            if(j==0){
                throw new MyException("this program cannot print result as 0");
            }
            System.out.println(j);

        } catch (MyException e) {
            System.out.println("Some problem is there | error : " + e);
        }
        System.out.println(j);
        System.out.println("bye");
    }
}
