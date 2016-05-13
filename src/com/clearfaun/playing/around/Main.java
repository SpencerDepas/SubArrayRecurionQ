package com.clearfaun.playing.around;

import java.util.Arrays;

public class Main {


    private static int[] theArray;
    private static int arraySize = 11;

    public static void main(String[] args) {
	// write your code here


       // find the largest sum in an array in a subaary using recursion

        generateRandomArray();

        System.out.println("remove dups " + Arrays.toString(theArray));
        //output [4, -56, -45, 66, 47, 20, -31, -90, -59, 37, 16]



        int largestSumBetweenINDEXES = 0;
        for(int i = arraySize ; i > 0; i--){
            for(int z = 0; z < arraySize; z ++){

                highestSubArrayTwo = 0;
                int temp = findLargestSumBetweenIndex(z, i);


                if(largestSumBetweenINDEXES < temp){
                    largestSumBetweenINDEXES = temp;
                    System.out.println("findLargestSum " + largestSumBetweenINDEXES);

                }


            }
        }



    }




    static int highestSubArrayTwo = 0;


    public static int findLargestSumBetweenIndex(int startingIndex, int endingIndex){

        if(startingIndex + 1 > endingIndex){
            //System.out.println("highestSubArrayTwo " + highestSubArrayTwo);

            return highestSubArrayTwo;
        }else {

            highestSubArrayTwo += theArray[endingIndex -1];
            return findLargestSumBetweenIndex(startingIndex, endingIndex -1);
        }


    }



    public static void generateRandomArray (){
        //Construct the array we're using here
        theArray = new int[arraySize];

        int sum = 0;
        for(int i = 0 ; i < arraySize; i ++){

            theArray[i] =  (int)(Math.random() * ( 200 ) - 100);
            sum += theArray[i];
        }

        System.out.println("for sum " + sum);


    }
}
