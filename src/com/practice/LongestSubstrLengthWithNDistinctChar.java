package com.practice;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstrLengthWithNDistinctChar {


    public static int findLength(String s, int n){

        Map<Character, Integer> characterMap = new HashMap<>();

        //Initialize i and j to zero
        int i=0, j=0, maxLength = 0;
        
        //Until j is less than size of string
        while (j<s.length()){
            
            //Keep increasing the size of window by moving j to right until number of distinct character is less than equal to N
            while (j<s.length() && characterMap.size()<=n){
                characterMap.put(s.charAt(j), characterMap.getOrDefault(s.charAt(j), 0)+1);
                j++;
            }

            //Record the length of substr of N distinct characters
            if((j-i-1)>maxLength){
                maxLength = (j-i-1);
            }

            //Reduce the window size by moving i to right by one position
            characterMap.put(s.charAt(i), characterMap.get(s.charAt(i))-1);

            //Remove the character from characterMap when its occurrence become zero
            if(characterMap.get(s.charAt(i)) == 0){
                characterMap.remove(s.charAt(i));
            }
            i++;

        }
        return maxLength;

    }
}
