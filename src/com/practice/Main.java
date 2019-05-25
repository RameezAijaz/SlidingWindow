package com.practice;

import java.util.Arrays;
import java.util.List;

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


/*
        Given an array of characters where each character represents a fruit tree, you are given two baskets and your goal is to put maximum number of fruits in each basket. The only restriction is that each basket can have only one type of fruit.

        You can start with any tree, but once you have started you can’t skip a tree. You will pick one fruit from each tree until you cannot, i.e., you will stop when you have to pick from a third fruit type.

        Write a function to return the maximum number of fruits in both the baskets.

        Example

        Input: Fruit=['A', 'B', 'C', 'A', 'C']
        Output: 3
        Explanation: We can put 2 'C' in one basket and one 'A' in the other from the subarray ['C', 'A', 'C']

        */

        String[] fruits = new String[]{"A", "B", "C", "B", "B", "C"};
        int numberOfBaskets = 2;
        int maxNumberOfFruits = MaxFruitInNBasket.getMaxFruit(fruits, numberOfBaskets);

        System.out.println("____MAX NUMBER OF FRUITS IN "+ numberOfBaskets +" DISTINCT BASKETS______");
        System.out.println(maxNumberOfFruits);



/*
        Given a string, find the length of the longest substring which has no repeating characters.

        Example:

        Input: String="aabccbb"
        Output: 3
        Explanation: The longest substring without any repeating characters is "abc".

*/

        str = "aabccbb";
        int max = LengthOfLongestSubstrOfDistinctChar.findLength(str);
        System.out.println("____LENGTH OF LONGEST SUBSTRING OF DISTINCT CHARACTERS______");
        System.out.println(max);


/*      Problem Statement
        Given a string with lowercase letters only, if you are allowed to replace no more than ‘k’ letters with any letter, find the length of the longest substring having the same letters after replacement.

        Example 1:

        Input: String="aabccbb", k=2
        Output: 5
        Explanation: Replace the two 'c' with 'b' to have a longest repeating substring "bbbbb".
                Input: String="aabccbb", k=2
        Output: 5
        Explanation: Replace the two 'c' with 'b' to have a longest repeating substring "bbbbb".*/


        String s = "abababa";
        int k = 2;
        max = LongestRepeatingSubstrAfterKReplacements.findLength(s, k);

        System.out.println("____LENGTH OF LONGEST SUBSTRING OF "+s+" WITH SAME CHARACTERS AFTER "+k+" REPLACEMENT______");
        System.out.println(max);



/*      Given an array containing 0s and 1s, if you are allowed to replace no more than ‘k’ 0s with 1s, find the length of the longest subarray having all 1s.

        Example:

        Input: Array=[0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1], k=2
        Output: 6
        Explanation: Replace the '0' at index 5 and 8 to have the longest subarray of 1s having length 6.
        Input: Array=[0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1], k=2
        Output: 6
        Explanation: Replace the '0' at index 5 and 8 to have the longest subarray of 1s having length 6.

        */


        int[] arr = {0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1};
        k = 2;

        max = LengthOfLongestSubArrOf1sAfterKReplacements.findLength(arr, k);

        System.out.println("____LENGTH OF LONGEST SUBARRAY OF 1's in "+ Arrays.toString(arr)+" AFTER "+k+" REPLACEMENT______");
        System.out.println(max);

/*
        Given a string and a pattern, find out if the string contains any permutation of the pattern.

        Permutation is defined as the re-arranging of the characters of the string. For example, “abc” has the following six permutations:

        Input: String="oidbcaf", Pattern="abc"
        Output: true
        Explanation: The string contains "bca" which is a permutation of the given pattern.*/


        s = "oidbcaf";
        String ptr = "abc";

        System.out.println("____IF STRING "+s+" CONTAINS PERMUTATION OF "+ ptr+"______");
        System.out.println(PermutationOfPattern.hasPermutation(s, ptr));

/*
        Given a string and a pattern, find all anagrams of the pattern in the given string.

                Anagram is actually a Permutation of a string. For example, “abc” has the following six anagrams:

        abc
                acb
        bac
                bca
        cab
                cba
        Write a function to return a list of starting indices of the anagrams of the pattern in the given string.

        Example:

        Input: String="ppqp", Pattern="pq"
        Output: [1, 2]
        Explanation: The two anagrams of the pattern in the given string are "pq" and "qp".*/


        str = "ppqp";
        ptr = "pq";

        List<Integer> allAnagrams = AllAnagramsOfPatternInString.find(str, ptr);


        System.out.println("____ALL ANAGRAM OF "+ptr+" IN "+ str + "______");
        System.out.println(allAnagrams);

/*
        Given a string and a pattern, find the smallest substring in the given string which has all the characters of the given pattern.

        Example 1:

        Input: String="aabdec", Pattern="abc"
        Output: "abdec"
        Explanation: The smallest substring having all characters of the pattern is "abdec"*/


        str = "aabdec";
        ptr = "abc";
        System.out.println("____SMALLEST SUBSTRING OF "+str+" THAT CONTAINS "+ ptr + "______");
        System.out.println(SmallestSubstrInGivenStrContainsPtr.find(str, ptr));

/*
        Given a string and a list of words, find all the starting indices of substrings in the given string that are a concatenation of all the given words exactly once without any overlapping of words. You can assume that all words are of the same length.

                Example 1:

        Input: String="catfoxcat", Words=["cat", "fox"]
        Output: [0, 3]
        Explanation: The two substring containing both the words are "catfox" & "foxcat".
                Input: String="catfoxcat", Words=["cat", "fox"]
        Output: [0, 3]
        Explanation: The two substring containing both the words are "catfox" & "foxcat".*/

        str = "catcatfoxfox";
        String[] words = {"cat", "fox"};

        List<Integer> indices = ConcatOfWordsInString.findIndices(str, words);

        System.out.println("____CONCATINATION OF "+Arrays.toString(words)+" IN STRING "+ str + "______");
        System.out.println(indices);

    }
}
