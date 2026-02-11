class Calculator{
    int num1;
    int num2;
    public Calculator(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    public void sumOfTwo(){
        System.out.println("the sum of the two number is : "+(num1+num2));
    }
}
public class AnonymousObj{
    public static void main(String[] args) {
        new Calculator(2,3).sumOfTwo();
    }
}