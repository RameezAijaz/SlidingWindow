package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllAnagramsOfPatternInString {

    public static List<Integer> find(String str, String pat){
        Map<Character, Integer> letterFreqMap = new HashMap<>();
        int windowEnd=0, windowStart=0, charMatched=0;
        List<Integer> anagramIndices = new ArrayList<>();
        for(char s :pat.toCharArray())
            letterFreqMap.put(s, letterFreqMap.getOrDefault(s,0)+1);

        for(windowEnd=0; windowEnd<str.length(); windowEnd++){

            Character charAtWinEnd = str.charAt(windowEnd);
            if(letterFreqMap.containsKey(charAtWinEnd)){

                letterFreqMap.put(charAtWinEnd, letterFreqMap.get(charAtWinEnd)-1);

                if(letterFreqMap.get(charAtWinEnd) == 0)
                    charMatched++;
            }

            if(charMatched == letterFreqMap.size())
                anagramIndices.add(windowStart);

            if(windowEnd-windowStart+1==pat.length()){

                Character charAtWinStart = str.charAt(windowStart);
                if(letterFreqMap.containsKey(charAtWinStart)){
                    if(letterFreqMap.get(charAtWinStart) == 0)
                        charMatched--;

                    letterFreqMap.put(charAtWinStart, letterFreqMap.get(charAtWinStart)+1);
                    windowStart++;

                }
            }


        }

        return anagramIndices;

    }
}
