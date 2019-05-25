package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmallestSubstrInGivenStrContainsPtr {


    public static String find(String str, String ptr){

        Map<Character, Integer> ptrLettterFreqMap = new HashMap<>();
        int windowEnd=0, windowStart=0, charMatched=0, min = Integer.MAX_VALUE;
        int[] indices = new int[2];
        for(char c:ptr.toCharArray())
            ptrLettterFreqMap.put(c, ptrLettterFreqMap.getOrDefault(c,0)+1);

        for(windowEnd=0; windowEnd<str.length(); windowEnd++){

            char charAtWindowEnd = str.charAt(windowEnd);

            if(ptrLettterFreqMap.containsKey(charAtWindowEnd)){
                ptrLettterFreqMap.put(charAtWindowEnd, ptrLettterFreqMap.get(charAtWindowEnd)-1);

                if(ptrLettterFreqMap.get(charAtWindowEnd) == 0 ){
                    charMatched++;
                }
            }

            while(charMatched == ptrLettterFreqMap.size()){

                if(min>(windowEnd-windowStart-1)){
                    indices[0] = windowStart-1;
                    indices[1] = windowEnd;
                    min = windowEnd-windowStart-1;
                }
                char charAtWindowStart = str.charAt(windowStart);
                if(ptrLettterFreqMap.containsKey(charAtWindowStart)){
                    if(ptrLettterFreqMap.get(charAtWindowStart) == 0)
                        charMatched--;

                    ptrLettterFreqMap.put(charAtWindowStart, ptrLettterFreqMap.get(charAtWindowEnd)+1);
                }
                windowStart++;
            }

        }

        System.out.println(indices[0]);
        System.out.println(indices[1]);
        return str.substring(indices[0], indices[1]+1);
    }
}
