class Calculator{
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int add(int n1,int n2,int n3){//method_overloading
        return n1+n2+n3;
    }
    public int add(int n1,int n2,int n3,int n4){//method_overloading 
        return n1+n2+n3+n4;
    }
    public int sub(int n1,int n2){
        return n1-n2;
    }
    public int mul(int n1,int n2){
        return n1*n2;
    }
    public int div(int n1,int n2){
        return n1/n2;
    }
    public int mod(int n1,int n2){
        return n1%n2;
    }
}
// @SuppressWarnings("unused")
public class ClassAndObject{
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        int result1=calc.add(5,6);
        System.out.println(result1);
        int result2=calc.sub(6,5);
        System.out.println(result2);
        int result3=calc.mul(6,5);
        System.out.println(result3);
        int result4=calc.div(6,5);
        System.out.println(result4);
        int result5=calc.mod(9,2);
        System.out.println(result5);
        int result6=calc.add(9,2,3);
        System.out.println(result6);
        int result7=calc.add(9,2,5,6);
        System.out.println(result7);
    }
}