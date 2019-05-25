package com.practice;

public class LengthOfLongestSubArrOf1sAfterKReplacements {

    public static int findLength(int[] arr , int k){

        int i=0, j=0, countOf1s=0, max=0;

        while (j<arr.length){

            if(arr[j] == 1)
                countOf1s++;

            if((j-i+1-countOf1s)>k){
                if(arr[i] == 1)
                    countOf1s--;

                i++;
            }

            max = Math.max(max, j-i+1);
            j++;

        }

        return max;

    }
}
