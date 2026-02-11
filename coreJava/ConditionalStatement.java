import java.util.Scanner;

class ConditionalStatement{
    public static void main(String[]args){
       Scanner input=new Scanner(System.in); 
       System.out.print("Enter the first number :");
       int num1=input.nextInt();
       System.out.println();
       System.out.print("Enter the second number :");
       int num2=input.nextInt();
       System.out.println();

       if(num1>num2)
            System.out.println("Bigger number is : "+num1);
        else
            System.out.println("Bigger number is : "+num2);

       System.out.println();
       System.out.print("Enter the third number :");
       int num3=input.nextInt();
       System.out.println();
       

       if(num1>num2 && num1>num3)
            System.out.println("Bigger number is : "+num1);
        else if(num2>num3)
            System.out.println("Bigger number is : "+num2);
        else
            System.out.println("Bigger number is : "+num3);

        System.out.println("----------Ternary Operator----------");

        int result=(num3>num2)? 1:0;
        boolean realSts=(result!=0);
        System.out.println("Result :"+realSts);
        
        System.out.println("----------Switch Statement----------");
        /*You might’ve seen switch(true) in JavaScript — it’s valid there because JS switch can compare any value (including boolean).
But in Java, the switch is type-restricted and designed for discrete, constant cases — not logical conditions.*/
        System.out.print("Enter todays weekday : ");
        int weekDay=input.nextInt();
        System.out.println();
        switch(weekDay){
            case 1 -> System.out.println("today is : Monday");
            case 2 -> System.out.println("today is :Tuesday");
            case 3 -> System.out.println("today is :Wednusday");
            case 4 -> System.out.println("today is :Thursday");
            case 5 -> System.out.println("today is :Friday");
            case 6 -> System.out.println("today is :Saturday");
            default -> System.out.println("today is :Sunday");
        }

        /*switch(weekDay){
            case 1:
                System.out.println("today is : Monday");
                break;
            case 2:
                System.out.println("today is :Tuesday");
                break;
            case 3:
                System.out.println("today is :Wednusday");
                break;
            case 4:
                System.out.println("today is :Thursday");
                break;
            case 5:
                System.out.println("today is :Friday");
                break;
            case 6:
                System.out.println("today is :Saturday");
                break;
            default:
                System.out.println("today is :Sunday");
        } */

        int nextDay = (weekDay % 7) + 1;


        switch(nextDay){
            case 1 -> System.out.println("tommorow will be : Monday");
            case 2 -> System.out.println("tommorow will be :Tuesday");
            case 3 -> System.out.println("tommorow will be :Wednusday");
            case 4 -> System.out.println("tommorow will be :Thursday");
            case 5 -> System.out.println("tommorow will be :Friday");
            case 6 -> System.out.println("tommorow will be :Saturday");
            default -> System.out.println("tommorow will be :Sunday");
        }

    }
}