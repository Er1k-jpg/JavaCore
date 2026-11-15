package Homework;


public class arrawUtil {
    public static void main(String[] args) {

        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};


        // 1. Элементы массива
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println();


        // 2. Первый элемент массива
        System.out.println("first element: " + numbers[0]);
        System.out.println();


        // 3. Последний элемент массива
        System.out.println("last element: " + numbers[numbers.length - 1]);
        System.out.println();


        // 4. Длина элементов массива
        System.out.println("Array length: " + numbers.length);
        System.out.println();


        // 5. Самое маленькое число массива
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }

        }
        System.out.println("Minimum number: " + min);
        System.out.println();


        // 6. Среднее число массива
        System.out.println("Middle element: " + numbers[numbers.length / 2]);
        System.out.println();


        //7. Кол-во четных чисел в массиве
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Even numbers count: " + count);
        System.out.println();


        //8. Кол-во нечетных чисел в массиве
        int oddCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("Odd numbers count: " + oddCount);
        System.out.println();


        // 9. Сумма чисел в находящихся в массиве
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }
        System.out.println("Sum: " + sum);
        System.out.println();


        // 10. Среднее значение элементов массива
        double average = (double) sum / numbers.length;
        System.out.println("Average: " + average);
        System.out.println();


        // 1.Бонусное задание. Самое большое число массива
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum number: " + max);
        System.out.println();

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


        System.out.println("PositiveCount: " + positiveCount);
        System.out.println("NegativeCount: " + negativeCount);
        System.out.println("ZeroCount: " + zeroCount);
        System.out.println();


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
            System.out.print(number + " ");
        }


    }
}




