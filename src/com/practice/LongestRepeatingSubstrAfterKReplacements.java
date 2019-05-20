package com.practice;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingSubstrAfterKReplacements {

    public static int findLength(String str, int k){
        int i=0, j=0, maxRepeatingCharacters = 0, maxWindowSize =0;
        Map<Character, Integer> letterFreqMap = new HashMap<Character, Integer>();

        while (j<str.length()){

            char nextChar = str.charAt(j);

            letterFreqMap.put(nextChar, letterFreqMap.getOrDefault(nextChar,0)+1);

            maxRepeatingCharacters = Math.max(maxRepeatingCharacters, letterFreqMap.get(nextChar));


            if((j-i+1-maxRepeatingCharacters) > k){
                char startChar = str.charAt(i);
                letterFreqMap.put(startChar, letterFreqMap.get(startChar)-1);
                i++;
            }

            maxWindowSize = Math.max(maxWindowSize, j-i+1);
            j++;

        }

        return maxWindowSize;
    }
}
