import java.util.*;

public class StringArrRev {

    static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    static String removeDuplicateVowels(String str) {
        Set<Character> vowelSet = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            char lower = Character.toLowerCase(ch);
            if ("aeiou".indexOf(lower) != -1) {
                if (!vowelSet.contains(lower)) {
                    vowelSet.add(lower);
                    result.append(ch);
                }
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    static String removeDuplicateCharacters(String str) {
        Set<Character> charSet = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (!charSet.contains(ch)) {
                charSet.add(ch);
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            arr[i] = sc.nextLine();
        }

        for (String str : arr) {
            String reversed = reverseString(str);
            String noDupVowels = removeDuplicateVowels(reversed);
            String finalString = removeDuplicateCharacters(noDupVowels);

            System.out.println("Result:--->>>");
            System.out.println("Original String: " + str);
            System.out.println("Reversed String: " + reversed);
            System.out.println("After Removing Duplicate Vowels: " + noDupVowels);
            System.out.println("Final String: " + finalString);
            System.out.println("Characters Left: " + finalString.length());
        }

        sc.close();
    }
}