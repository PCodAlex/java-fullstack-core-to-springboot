/*Variables & data types Coding Exercise
Inside the already defined main method of the Exercise class, your task is to:

Declare and initialize the following variables:

An int variable named age with the value 25

A double variable named height with the value 5.9

A String variable named name with the value "Alex"

Use System.out.println() to print the values in the exact following format:

Name: Alex,  Age: 25,  Height: 5.9

Instructions

Do not create a new class or main method — both are already provided.

Focus only on declaring variables and printing them.

Use System.out.println() for output, and ensure the format matches the expected output exactly.



Expected Output:

  Name: Alex,  Age: 25,  Height: 5.9 */


class FirstExercise{
    public static void main(String[]args){
        int age=25;
        double height=5.9;
        String name="Alex";
        System.out.println("Name :"+name+" , Age :"+age+" , Height :"+height);
    }
}