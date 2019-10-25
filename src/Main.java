import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[1]);

        int[] intArrays = new int[10];

        for(int i = 0; i<intArrays.length; i++){
            intArrays[i] = i * 10;
        }

        printArray(intArrays);

        //Array and Methods Exercise
        int[] arrayOfNumbers = getNumbers(5);

        //for(int i = 0; i<arrayOfNumbers.length; i++){
        //    System.out.println("Element " + i + " typed value was " + arrayOfNumbers[i]);
       // }

        //Print Average
        System.out.println("Average = " + getAverage(arrayOfNumbers));
        //Sort and Print Array Exercise
        int[] sorted = sortArray(arrayOfNumbers);
        printArray(sorted);

        //Minimum Element Challenge

        int[] integers = readIntegers(5);
        System.out.println("Minimum integer in the Array: " + findMin(integers));

        //Reverse Array Challenge
        int[] Array = {1, 2, 5 ,8, 9, 29, 12, 26};
        System.out.println(Arrays.toString(Array));
        reverse(Array);
        System.out.println(Arrays.toString(Array));



    }

    public static void printArray(int[] array){
        for(int i = 0; i<array.length; i++){
            System.out.println("Element " + i + " Value is = " + array[i]);
        }
    }

    public static int[] getNumbers(int number){
        int[] numbers = new int[number];
        System.out.println("Enter " + number + " Integer Numbers: \r" );

        for(int i = 0; i<numbers.length; i++){
            numbers[i] = console.nextInt();
        }
        return numbers;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        int[] values = array;

        for(int i = 0; i < values.length; i++){
            sum += values[i];
        }

        return (double) sum / (double) values.length;
    }

    public static int[] sortArray(int[] array){
        int[] values = new int[array.length];
        for(int i = 0; i<array.length; i++){
            values[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i = 0; i<values.length-1; i++){
                if(values[i] < values[i+1]){
                    temp = values[i];
                    values[i] = values[i+1];
                    values[i+1] = temp;
                    flag = true;
                }
            }
        }
        return values;
    }

    public static int[] readIntegers(int integers){
        int[] values = new int[integers];
        System.out.println("Enter " + integers + " Numbers: ");
        for(int i = 0; i < values.length; i++){
            values[i] = console.nextInt();
        }
        return values;
    }

    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < array.length; i++){
            int value = array[i];

            if(value < min){
                min = value;
            }
        }
        return min;
    }

    public static void reverse(int[] array){
        int maxValue = array.length-1;
        int halfwayValue = array.length / 2;

        for(int i = 0; i < halfwayValue; i++){
            int temp = array[i];
            array[i] = array[maxValue - 1];
            array[maxValue - 1] = temp;
        }
    }




}
