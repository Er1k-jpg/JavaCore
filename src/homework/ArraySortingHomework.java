package homework;
import java.util.Arrays;


public class ArraySortingHomework {
    public static void main(String[] args) {
        int[] numbers = {12, 5, 8, -3, 21, 7, 0, 15, 2, 9};

        // 1.Написать числа массива по возврастанию.
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println();


        // 2.Написать числа массива по убыванию.
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] > numbers[i]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
