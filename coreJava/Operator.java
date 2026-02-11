class Operator{
    public static void main(String[]args){

        //Arithmatic Operator
        byte num1=7;
        byte num2=5;

        //Java automatically promotes all operands smaller than int (like byte, short, char) to int during arithmetic operations.
        byte sum= (byte)(num1 + num2);
        byte sub= (byte)(num1 - num2);
        byte mul= (byte)(num1 * num2);
        byte div= (byte)(num1 / num2);
        byte mod= (byte)(num1 % num2);
        System.out.println("------------------------Arithmatic Operator-----------------------------");
        System.out.println("sum :"+sum+" | sub :" +sub+" | mul :"+mul+" | div :"+div+ " | mod :"+mod);

        //Unary Operator

        //Prefix (++x) Before the expression is evaluated int y = ++x; → x and y both updated
        num1++;
        num2++;

        System.out.println("------------------------Unary Operator-----------------------------");
        System.out.println("num1 :"+num1+" | num2 :"+num2);

        num1--;
        num2--;

        System.out.println("num1 :"+num1+" | num2 :"+num2);

        //Postfix (x++) After the expression is evaluated int y = x++; → y old, x new
        ++num1;
        ++num2;

        System.out.println("num1 :"+num1+" | num2 :"+num2);

        --num1;
        --num2;

        System.out.println("num1 :"+num1+" | num2 :"+num2);

        //Assignment Operator [=,+=,-=]
        num1+=1;//7+1=8
        num2-=1;//5-1=4
        System.out.println("------------------------Assignment Operator-----------------------------");
        System.out.println("num1 :"+num1+" | num2 :"+num2);

        num1*=2;//8*2=16
        num2/=2;//4/2=2
        System.out.println("num1 :"+num1+" | num2 :"+num2);

        num1%=2;//16%2
        num2%=2;//2%2
        System.out.println("num1 :"+num1+" | num2 :"+num2);

        //Relational Operator [<,>,==,!=,<=,>=]

        num1=7;
        num2=5;

        boolean result1=num1<num2;
        boolean result2=num1>num2;
        boolean result3=num1>=num2;
        boolean result4=num1<=num2;
        boolean result5=num1==num2;
        boolean result6=num1!=num2;

        System.out.println("------------------------Relational Operator-----------------------------");
        System.out.println("result1 :"+result1);
        System.out.println("result2 :"+result2);
        System.out.println("result3 :"+result3);
        System.out.println("result4 :"+result4);
        System.out.println("result5 :"+result5);
        System.out.println("result6 :"+result6);

        System.out.println("------------------------Relational Operator-----------------------------");
        System.out.println(" && : AND | || : OR | ! :NOT ");

        System.out.println("-----Short circuit-----");
        byte num3=4;
        byte num4=6;
        boolean result7=num1<=num2 && num3<=num4;
        boolean result8=num1<=num2 || num3<=num4;
        System.out.println(" num1<=num2 && num3<=num4 :"+result7);//because  of &&[AND Operator] it will check both if the first ones gives false it will return false directly it will no wait for checking the second one is true or false
        System.out.println(" num1<=num2 || num3<=num4 :"+result8);//because  of &&[AND Operator] it will check both if the first ones gives false it will return false directly it will no wait for checking the second one is true or false
    }
}