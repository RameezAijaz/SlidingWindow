package com.practice;

import java.util.*;

public class ConcatOfWordsInString {

    public static List<Integer> findIndices(String str, String[] words){
        Map<String, Integer> wordFreqMap = new HashMap<>();

        for(String word: words)
            wordFreqMap.put(word, wordFreqMap.getOrDefault(word,0)+1);

        int windowEnd=0, windowStart=0, lengthOfWord=words[0].length(), wordMatched=0;
        List<Integer> indices = new ArrayList<>();


        for(windowEnd=0; windowEnd<str.length(); windowEnd+=lengthOfWord){

            String wordAtEnd = str.substring(windowEnd, windowEnd+lengthOfWord);


            if(wordFreqMap.containsKey(wordAtEnd)){
                wordFreqMap.put(wordAtEnd, wordFreqMap.get(wordAtEnd)-1);
                if(wordFreqMap.get(wordAtEnd)==0)
                    wordMatched++;
            }

            if(wordMatched == wordFreqMap.size()){
                indices.add(windowStart);
            }

            if(((windowEnd+lengthOfWord)-windowStart)/lengthOfWord>=wordFreqMap.size()){
                String wordAtStart = str.substring(windowStart, windowStart+lengthOfWord);

                if(wordFreqMap.containsKey(wordAtStart)){

                    if(wordFreqMap.get(wordAtStart)==0)
                        wordMatched--;

                    wordFreqMap.put(wordAtStart, wordFreqMap.get(wordAtStart)+1);
                }
                windowStart = windowStart+lengthOfWord;
            }


        }


        return indices;
    }
}
