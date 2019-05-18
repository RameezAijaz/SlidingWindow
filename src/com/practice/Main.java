package com.practice;

public class Main {

    public static void main(String[] args) {
	// write your code here

  /*      Given a string, find the length of the longest substring in it with no more than N distinct characters.

         Example:

        Input: String="araaci", N=2
        Output: 4
        Explanation: The longest substring with no more than '2' distinct characters is "araa".

         */


        String str = "araaci";
        int N = 2;
        int maxLength = LongestSubstrLengthWithNDistinctChar.findLength(str, N);

        System.out.println("____MAX LENGTH OF SUBSTRING WITH "+N+" DISTINCT CHARACTERS_______");
        System.out.println(maxLength);

    }
}
