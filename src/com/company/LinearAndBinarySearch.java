package com.company;

public class LinearAndBinarySearch {

    private static int counter = 0;

    public static void main(String[] args) {
        int[] array = new int[]{-10,-9,-7,-5,-4,0,1,2,3,4,5,6,7,10,11,23,25,26,28,29};

        System.out.println("Array length : " + array.length);
        System.out.println(linearSearch(array, 11));
        System.out.println(counter);
        System.out.println(binarySearch(array, 11));
        System.out.println(counter);
    }

    private static int linearSearch(int[] array, int elementToSearch){
        for(int i = 0;i <  array.length;i++){
            if(array[i] == elementToSearch){
                counter = i + 1;
                return array[i];
            }
        }
        return -1;
    }

    private static int binarySearch(int[] array, int elementToSearch){
        int lowIndex = 0;
        int highIndex = array.length - 1;
        counter = 0;
        while (lowIndex <= highIndex){
            counter++;
            int midIndex = (lowIndex + highIndex) / 2;
            int midElement = array[midIndex];
            if(midElement < elementToSearch){
                lowIndex = midIndex + 1;
            }
            else if(midElement > elementToSearch){
                highIndex = midIndex - 1;
            }
            else {
                return midElement;
            }
        }
        return -1;
    }
}
