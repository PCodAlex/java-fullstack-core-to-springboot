// 1.write a program to find vowels in a given string in the array and remove the duplicate vowels and give the count of charecters after remove 
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class FirstQuestion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String vowels = "aeiouAEIOU";
        Set<Character> seenVowels = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (vowels.indexOf(ch) != -1) { 
                if (!seenVowels.contains(ch)) {
                    seenVowels.add(ch);
                    result.append(ch);
                }
            } else {
                result.append(ch); 
            }
        }

        System.out.println("String after removing duplicate vowels: " + result);
        System.out.println("Count of characters: " + result.length());

    }
}