class Calculator{
    int num=0;//instance Variable 
    public int add(int num1,int num2){//local variable 
        return num1+num2;
    }
}
public class StackAndHeap{
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        int result=calc.add(2,3);
        System.out.println(result);
        System.out.println(calc.num);
    }
}
/*
Every method will have a stack
and object that stored into the heap memory , it has two section
one is for the instance varibles 
        int num=0;
        
and another store the definition of the methods present in the object class
        public int add(int num1,int num2){//local variable 
                return num1+num2;
            }
*/ 