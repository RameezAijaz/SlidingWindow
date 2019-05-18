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

    }
}
