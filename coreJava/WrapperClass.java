class WrapperClass{
    public static void main(String[] args) {
        int num1=5;
        Integer num2=new Integer(num1);  //Boxing 
        Integer num3=num1; //Auto_Boxing

        int num4=num2.intValue();
        int num5=num3;

        System.out.println(num4+" : "+num5);

        String str="5";
        int num6=Integer.parseInt(str);
        System.out.println(num6*2);
    }
}
/*
✅ What is a Wrapper Class?

A wrapper class is a class that converts a primitive data type into an object.

Primitive	Wrapper Class
int	Integer
double	Double
char	Character
boolean	Boolean
byte	Byte
short	Short
long	Long
float	Float
✅ Why do we need Wrapper Classes?

Java collections and many APIs work only with objects, not primitives.

We need wrapper classes to:

Store primitives in Collections (ArrayList, HashMap)

Use utility methods (parseInt(), compareTo(), etc.)

Allow null values (primitives can’t be null)

Enable object-based operations like equals()

Example:

ArrayList<Integer> list = new ArrayList<>();
list.add(10);   // primitive int becomes Integer object

✅ Autoboxing

Autoboxing = automatic conversion of primitive → wrapper object

int a = 10;
Integer obj = a;   // Autoboxing


Behind the scenes:

Integer obj = Integer.valueOf(a);

✅ Auto Unboxing

Auto Unboxing = automatic conversion of wrapper → primitive

Integer obj = 20;
int b = obj;    // Auto Unboxing


Behind the scenes:

int b = obj.intValue();

✅ Real Example
ArrayList<Integer> list = new ArrayList<>();

list.add(5);        // Autoboxing
int num = list.get(0);  // Auto Unboxing

System.out.println(num); // 5

Easy Memory Rule 🧠
Primitive → Object = Auto Boxing
Object → Primitive = Auto Unboxing

One-line Summary

A wrapper class wraps a primitive inside an object so Java can treat primitive values as objects, and autoboxing/unboxing makes conversion happen automatically.
*/