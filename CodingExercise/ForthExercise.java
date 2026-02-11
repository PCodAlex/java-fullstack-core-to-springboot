/*Mastering Loops in Java: For, While, and Do-While in Action
Write a Java program that prints the numbers from 1 to 5 using three different loop types:

for loop

while loop

do-while loop

Each loop should run independently and print its result on a single line, clearly labeled. Numbers should be printed with spaces between them and no trailing space at the end.



Instructions:

Use a for loop when the number of iterations is fixed (1 to 5).

Use a while loop to repeat the same logic with a counter.

Use a do-while loop to show that it runs at least once.

Each loop's output should be labeled (e.g., "For Loop: 1 2 3 4 5").

Use System.out.print() to format the output properly.



Expected Output:

  For Loop:  1  2  3  4  5

  While Loop:  1  2  3  4  5

  Do-While Loop:  1  2  3  4  5*/

class ForthExercise{
    public static void main(String[] args) {
        int fst=1;
        int lst=5;
        System.out.print("For Loop:");
        for(;fst<=lst;){
            System.out.print(" "+fst);
            fst++;
        }
        System.out.println();
        fst=1;
        System.out.print("While Loop:");
        while(fst<=lst){
            System.out.print(" "+fst);
            fst++;
        }
        System.out.println();
        fst=1;
        System.out.print("Do-While Loop:");
        do{
            System.out.print(" "+fst);
            fst++;
        }while(fst<=lst);
        System.out.println();
    }
}