package com.practice;

import java.util.HashMap;
import java.util.Map;

public class MaxFruitInNBasket {

    public static int getMaxFruit(String [] fruits, int numOfBaskets){

        int i=0, j=0, maxNumOfFruits = Integer.MIN_VALUE;
        Map<String, Integer> fruitMap = new HashMap<>();

        while (j<fruits.length){

            while(j<fruits.length && fruitMap.size()<=numOfBaskets){
                fruitMap.put(fruits[j], fruitMap.getOrDefault(fruits[j],0)+1);
                j++;
            }

            if((j-i)>maxNumOfFruits){
                maxNumOfFruits = (j-i);
            }

            fruitMap.put(fruits[i], fruitMap.get(fruits[i])-1);

            if(fruitMap.get(fruits[i]) ==0){
                fruitMap.remove(fruits[i]);
            }

            i++;

        }

        return maxNumOfFruits;


    }
}
