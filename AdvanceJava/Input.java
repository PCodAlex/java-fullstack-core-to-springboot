import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws IOException {
        System.out.println("enter a number :");
        //public final class System{}
        //public static final PrintStream out = null;
        //public void print(Object obj) {
        //write(String.valueOf(obj));
        //}


        //int num=System.in.read(); // .read() will return int value based on the inputs ascii value
        //System.out.print(num);

        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader bf= new BufferedReader(in);
        int num=Integer.parseInt(bf.readLine());
        System.out.println(num);

        /*
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);
        ✅ 1️⃣ System.in (lowest level input)
        java
        Copy code
        System.in
        This is an object of InputStream.

        It reads raw bytes from the keyboard.

        It does NOT understand characters or strings.

        It only knows “byte by byte”.

        Think: Keyboard → bytes → System.in

        ✅ 2️⃣ InputStreamReader: converts bytes → characters
        java
        Copy code
        InputStreamReader in = new InputStreamReader(System.in);
        What does this do?
        Wraps System.in.

        Converts bytes into characters (Unicode).

        It is a bridge between byte streams and character streams.

        Why needed?
        Because humans type characters, not bytes.

        Think:
        🧑 (user types) → 💻 bytes → InputStreamReader → 🅰 characters

        ✅ 3️⃣ BufferedReader: reads characters efficiently
        java
        Copy code
        BufferedReader bf = new BufferedReader(in);
        What does it do?
        Wraps the InputStreamReader

        Provides buffering (fast)

        Provides readLine() method

        Why use BufferedReader?
        InputStreamReader can only read 1 char at a time.

        BufferedReader can read a whole line at once.

        So now the chain is:

        scss
        Copy code
        System.in (bytes)
            ↓
        InputStreamReader (bytes → characters)
            ↓
        BufferedReader (characters → lines)
        ✅ 4️⃣ Reading a full line as String
        java
        Copy code
        String line = bf.readLine();
        What happens?
        User types something (e.g., 123)

        Presses Enter

        readLine() returns the whole input as a String
        → "123"

        So if you typed:

        Copy code
        123
        readLine() gives: "123"

        ✅ 5️⃣ Converting String → int
        java
        Copy code
        int num = Integer.parseInt(bf.readLine());
        This means:

        Read a line (ex: "123")

        Convert String "123" → integer 123

        Integer.parseInt() only accepts:

        Numbers in string format

        No spaces

        No alphabets

        🧠 Complete Diagram (Very Easy)






        pgsql
        Copy code
        Keyboard
        ↓ (bytes)
        System.in   → (InputStream)
        ↓
        InputStreamReader → (Converts bytes to chars)
        ↓
        BufferedReader → (Reads line by line)
        ↓
        readLine() returns a String
        ↓
        Integer.parseInt() converts String → int
        ⭐ Final Super-Clear Summary
        Line	Explanation
        InputStreamReader in = new InputStreamReader(System.in);	Converts bytes from keyboard into characters
        BufferedReader bf = new BufferedReader(in);	Reads text line by line, efficiently
        bf.readLine()	Reads whole line as a String
        Integer.parseInt(...)	Converts String → int
        System.out.println(num);	Prints the integer
        */
       System.out.println("enter the second number:");
       Scanner sc=new Scanner(System.in);
       int num2=sc.nextInt();
       System.out.println(num2);

       /*
       System.out.println("enter the second number:");
        Scanner sc = new Scanner(System.in);
        int num2 = sc.nextInt();
        System.out.println(num2);
        ✅ 1️⃣ System.out.println("enter the second number:");
        Prints the message on the screen.

        Tells the user to type a number.

        println() adds a new line after printing.

        ✅ 2️⃣ Scanner sc = new Scanner(System.in);
        This is the MOST important line.
        We need to break it down:

        ✔ System.in
        Low-level input stream

        Reads bytes from keyboard

        ✔ new Scanner(...)
        Scanner is a high-level class

        It converts keyboard input into:

        int

        double

        string

        long

        etc.

        ✔ Why pass System.in to Scanner?
        Scanner needs a source of input.
        You are telling Scanner:

        “Take input from the keyboard.”

        ✔ What Scanner really does internally
        Scanner wraps System.in and adds smart parsing.

        It can understand:
        ✔ Integers
        ✔ Floats
        ✔ Strings
        ✔ Space-separated input
        ✔ Line-based input

        Which BufferedReader cannot do directly.

        🔥 Diagram of what happens
        python
        Copy code
        Keyboard input
            ↓ (bytes)
        System.in  → InputStream
            ↓
        Scanner → Understands numbers, words, tokens
        ✅ 3️⃣ int num2 = sc.nextInt();
        This line:

        Waits for the user to type something.

        Scanner reads input until it finds a number.

        Converts the text → int.

        Stores it in num2.

        Example:
        User types:

        Copy code
        45
        Scanner does:

        bash
        Copy code
        "45"  → parses → 45 (integer)
        ⚠ IMPORTANT — What if user types something else?
        If user types:

        nginx
        Copy code
        hello
        nextInt() will throw:

        nginx
        Copy code
        InputMismatchException
        Because “hello” cannot be converted to an int.

        ✅ 4️⃣ System.out.println(num2);
        Prints the integer the user entered.

        This confirms the value was taken correctly.

        ⭐ FINAL CLEAR SUMMARY
        Code	Meaning
        System.out.println()	Prints message
        Scanner sc = new Scanner(System.in);	Creates an object that reads input from keyboard
        int num2 = sc.nextInt();	Reads and converts user input into an integer
        System.out.println(num2);	Prints the entered integer

        🔥 CHAIN (very easy to remember)
        scss
        Copy code
        Keyboard → System.in → Scanner → nextInt() → Integer value
       */
      sc.close();
    }
}
