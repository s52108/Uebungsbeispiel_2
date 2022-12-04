package org.campus02.arrays;

public class ArrayHelper {
    public static void arrangeOrder(int[] numbers) {


        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int temp = 0;
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }

            }
            System.out.print(numbers[i] + " ");

        }


    }

    public static void main(String[] args) {
        int[] numbers = {8, 5, 1, 9, 0, 4};

        System.out.print("Input: ");
        for (int i = 0; i < numbers.length; i++) {
            int output = numbers[i];
            System.out.print(output + " ");
        }

        System.out.print("\nOutput: ");
        arrangeOrder(numbers);



    }

}




