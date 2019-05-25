package com.practice;

import java.util.HashMap;
import java.util.Map;

public class PermutationOfPattern {

    public static boolean hasPermutation(String s, String p){

        Map<Character, Integer> letterFreqMap = new HashMap<>();

        for(int i=0; i<p.length(); i++)
            letterFreqMap.put(p.charAt(i), letterFreqMap.getOrDefault(p.charAt(i), 0)+1);

        int windowStart=0, charMatched=0;
        for(int windowEnd=0; windowEnd<s.length(); windowEnd++){
            char currentChar = s.charAt(windowEnd);

            if(letterFreqMap.getOrDefault(currentChar, 0)!=0){
                letterFreqMap.put(currentChar, letterFreqMap.get(currentChar)-1);
                if(letterFreqMap.get(currentChar) == 0){
                    charMatched++;
                }
            }
            if(charMatched == p.length())
                return true;

            if(windowEnd-windowStart+1>=p.length()){
                char charAtStart = s.charAt(windowStart);
                if(letterFreqMap.get(charAtStart) != null){
                    if(letterFreqMap.get(charAtStart)==0)
                        charMatched--;
                    letterFreqMap.put(charAtStart, letterFreqMap.get(charAtStart)+1);
                }
                windowStart++;
            }
        }

        return false;
    }
}
