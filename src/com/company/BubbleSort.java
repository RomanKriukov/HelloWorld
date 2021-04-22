package com.company;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{0,-2,-5,12,20,4,3,7,-8,30,22,6};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
    }

    private static void bubbleSort(int[] array){
        for(int i = 0;i < array.length - 1;i++){
            for(int j = 0;j < array.length - i - 1;j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
