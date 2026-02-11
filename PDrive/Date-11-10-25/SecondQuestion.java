// 2.write a program to find the largest substring in the given 5 string elements in an array 
import java.util.*;

public class SecondQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];

        System.out.println("Enter 5 strings:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextLine();
        }

        String maxString = "";
        int maxLength = 0;

        for (String str : arr) {
            if (str.length() > maxLength) {
                maxLength = str.length();
                maxString = str;
            }
        }

        System.out.println("The largest string is: " + maxString);
        System.out.println("Length of the largest string: " + maxLength);

    }
}
