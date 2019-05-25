package com.practice;

import java.util.HashMap;
import java.util.Map;

class LengthOfLongestSubstrOfDistinctChar {

    public static int findLength(String s){

        //Initialize window start and end to zero
        int i=0,j=0, max = Integer.MIN_VALUE;
        Map<Character, Integer> characterMap = new HashMap<>();

        //Do until window end is less than string length
        while(j<s.length()){

            //If character at window end j is not unique shrink the window by moving
            // window start i to last occurrence of character at window end j
            // if and only if last occurrence is greater than current windows start position i
            if(characterMap.get(s.charAt(j)) != null){
                i = Math.max(i,characterMap.get(s.charAt(j)));
            }

            //Update characterMap with the character at window end and its index
            characterMap.put(s.charAt(j), j);
            j++;

            //replace max if window size is greater than max
            max = Math.max(max, (j-i));
        }
        return max;

    }
}
