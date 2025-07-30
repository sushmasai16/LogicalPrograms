package com.interview.streams;

public class ReverseStringRecursion {

    public static String reverse(String str) {
        // Base case: if string is empty or has only one character
        if (str.isEmpty()) {
            return str;
        }
        // Recursive case: reverse the rest of the string, then add the first character at the end
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String original = "hello";
        String reversed = reverse(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
