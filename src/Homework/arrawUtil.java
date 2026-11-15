package Homework;

import javax.imageio.metadata.IIOMetadataFormatImpl;

import static java.lang.System.out;


public class arrawUtil {
    public static void main(String[] args) {

        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};


        // 1. Элементы массива
        for (int number : numbers) {
            out.print(number + " ");
        }
        out.println();
        out.println();


        // 2. Первый элемент массива
        out.println("first element: " + numbers[0]);
        out.println();


        // 3. Последний элемент массива
        out.println("last element: " + numbers[numbers.length - 1]);
        out.println();


        // 4. Длина элементов массива
        out.println("Array length: " + numbers.length);
        out.println();


        // 5. Самое маленькое число массива
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }

        }
        out.println("Minimum number: " + min);
        out.println();


        // 6. Среднее число массива
        out.println("Middle element: " + numbers[numbers.length / 2]);
        out.println();


        //7. Кол-во четных чисел в массиве
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        out.println("Even numbers count: " + count);
        out.println();


        //8. Кол-во нечетных чисел в массиве
        int oddCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddCount++;
            }
        }
        out.println("Odd numbers count: " + oddCount);
        out.println();



        // 9. Сумма чисел в находящихся в массиве
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }
        out.println("Sum: " + sum);
        out.println();


        // 10. Среднее значение элементов массива
        double average = (double) sum / numbers.length;
        out.println("Average: " + average);
        out.println();


        // 1.Бонусное задание. Самое большое число массива
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }


        }
        out.println("Maximum number: " + max);
        out.println();

        // 2.Бонусное задание. Кол-во положительных, отрицательных чисел и нулей.
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {
                positiveCount++;
            } else if (numbers[i] < 0) {
                negativeCount++;
            } else if (numbers[i] == 0) {
                zeroCount++;
            }

        }


        out.println("PositiveCount: " + positiveCount);
        out.println("NegativeCount: " + negativeCount);
        out.println("ZeroCount: " + zeroCount);
        out.println();


        //3. Бонусное задание. Первернутый массив.

        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
            i++;
            j--;
        }
        for (int number : numbers) {
            out.print(number + " ");
        }


    }
}




