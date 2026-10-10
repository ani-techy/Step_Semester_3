package org.example.Practiceproblem;


public class PalindromeChecker {

    // Approach 1: Iterative
    static boolean isPalindromeIterative(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    // Approach 2: Recursive
    static boolean isPalindromeRecursive(String text) {
        return checkRecursive(text, 0, text.length() - 1);
    }

    static boolean checkRecursive(String text, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (text.charAt(left) != text.charAt(right)) {
            return false;
        }

        return checkRecursive(text, left + 1, right - 1);
    }

    // Approach 3: Array Reversal
    static boolean isPalindromeArrayReversal(String text) {
        char[] arr = text.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        String reversed = new String(arr);
        return text.equals(reversed);
    }

    public static void main(String[] args) {
        String text = "madam";

        System.out.println("Iterative: "
                + (isPalindromeIterative(text)
                ? "Palindrome" : "Not Palindrome"));

        System.out.println("Recursive: "
                + (isPalindromeRecursive(text)
                ? "Palindrome" : "Not Palindrome"));

        System.out.println("Array Reversal: "
                + (isPalindromeArrayReversal(text)
                ? "Palindrome" : "Not Palindrome"));
    }
}
