class Calculator{
    int number=10;
    public int add(int num1,int num2){
        return num1 + num2;
    }
}
@SuppressWarnings("unused")
class InstanceVariable{
    public static void main(String[]args){
        Calculator cal=new Calculator();
        int result=cal.add(3,4);
        Calculator cal1=new Calculator();
        int result1=cal1.add(3,4);
        cal.number=8;
        System.out.println(cal.number +"  :  "+cal1.number);
        System.out.println(result+"  :  "+result1);
    }
}