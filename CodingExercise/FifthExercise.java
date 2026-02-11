/*Smart Console Calculator: Advanced Exercise: Build Your First Java Program That Thinks
Your task is to create a simple console-based calculator in Java that helps users perform basic math operations.

The program should follow this behavior:

Ask the user to enter two numbers (e.g., 5 and 3).

Ask the user to choose an operation:

+ for addition

- for subtraction

* for multiplication

/ for division

Perform the selected operation and display the result.

If the user tries to divide by zero, show a friendly error message like: "Cannot divide by zero."

After showing the result, ask the user:
"Do you want to calculate again? (y/n)"

If the user enters y, the calculator should start again.

If the user enters n, the program should end with a message:
"Thank you for using the calculator."

This calculator will run in a loop and continue to accept input until the user decides to exit.

This problem helps reinforce the use of:

Variables to store user input and results

Arithmetic operators for basic math

If-else statements to choose operations and handle edge cases

Loops to repeat the process until the user quits

Instructions:

Use the already provided Scanner object to take input from the user.

Use a while loop that continues executing as long as the variable again, which is already initialized to "y", satisfies the condition again.equalsIgnoreCase("y").

Prompt the user to enter two numbers. These can be int or double.

Ask the user to choose an operation: +, -, *, or /.

Use if-else statements to perform the operation based on the user's input.

Handle division carefully:

If the user tries to divide by zero, print: "Cannot divide by zero."

Do not perform the division if the second number is zero.

Print the result using System.out.println() in a clear format like:
"Result: 15.0"

Ask the user if they want to calculate again by typing y or n.

Use a while loop to keep the calculator running until the user types n or N.

  Tip: Use .equalsIgnoreCase("y") to keep the loop going, and charAt(0) if reading a character.



Expected Output:
   Enter first number:  10

   Enter second number:  5

   Choose operation (+, -, *, /):  *

   Result:   50.0

   Do you want to calculate again? (y/n):  y

   Enter first number:  9

   Enter second number:  0

   Choose operation (+, -, *, /):  /

   Cannot divide by zero.

   Do you want to calculate again? (y/n):  n

   Thank you for using the calculator. */
import java.util.Scanner;

class FifthExercise{
    public static void main(String[]args){
        try (Scanner input = new Scanner(System.in)) {
            boolean cal;
            do {
                System.out.print("Enter the First Number :");
                double fstNum=input.nextInt();
                System.out.println();
                
                System.out.print("Enter the Second Number :");
                double secNum=input.nextInt();
                System.out.println();
                
                System.out.print("Choose operation (+, -, *, /) :");
                char oprtor=input.next().charAt(0);
                System.out.println();
                double result;
                
                if(secNum==0 && Character.toLowerCase(oprtor)=='/'){
                    System.out.println("Cannot divide by zero."); 
                }
                else{
                    switch(oprtor){
                        case '+' -> {result=fstNum+secNum;
                        System.out.println(fstNum+" + "+secNum+" : "+(result));}
                        case '-' -> {result=fstNum-secNum;
                        System.out.println(fstNum+" - "+secNum+" : "+(result));}
                        case '*' -> {result=fstNum*secNum;
                        System.out.println(fstNum+" * "+secNum+" : "+(result));}
                        case '/' -> {result=fstNum/secNum;
                        System.out.println(fstNum+" / "+secNum+" : "+(result));}
                    }
                }
                
                System.out.println();
                System.out.print("Do you want to calculate again? (y/n): ");
                char choice=input.next().charAt(0);
                System.out.println();
                
                cal = Character.toLowerCase(choice)=='y';
            } while (cal);
        }
    }
}