package Homework;

public class arrayHomework {
    public static void main(String[] args) {
        int[] numbers = {6, 3, 8, 6, 1, 9, 6, 4, 2, 6};


        // 1.Кол-во цифры 6 в массиве
        int n = 6;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n)
                count++;
        }
        System.out.println("Count of 6: " + count);
        System.out.println();


        // 2.Перевернутый массив
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
        System.out.println();
        System.out.println();

        // 3. Повторяющиеся числа в массиве
        int[] nums = {3, 6, 8, 3, 9, 6, 2, 3, 5, 6};
        int count1 = 0;

        for (int k = 0; k < nums.length; k++) {

            boolean found = false;

            for (int p = 0; p < k; p++) {
                if (nums[k] == nums[p]) {
                    found = true;
                    break;
                }
            }
            if (found == false) {
                for (int l = k + 1; l < nums.length; l++) {
                    if (nums[k] == nums[l]) {
                        count++;
                        break;
                    }
                }
            }

        }
        System.out.println("Repeated numbers count: " + count1);
        System.out.println();


        // 4. Посчитать кол-во гласных.
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};

        int count2 = 0;
        for (int k = 0; k < chars.length; k++) {
            if (chars[k] == 'ա' || chars[k] == 'ե' || chars[k] == 'է' || chars[k] == 'ը' || chars[k] == 'ի' || chars[k] == 'ո' || chars[k] == 'օ') {
                count2++;

            }
        }
        System.out.println("Vowels count: " + count2);
        System.out.println();


        // 1. Бонус. Найти второе большое число
        int[] numbers1 = {4, 9, 2, 15, 7, 15, 3, 11, 6, 8};
        int max = 0;
        int secondmax = 0;
        for (int k = 0; k < numbers1.length; k++) {
            if (numbers1[k] > max) {
                secondmax = max;
                max = numbers1[k];
            }
            if (numbers1[k] < max && numbers1[k] > secondmax) {
                secondmax = numbers1[k];
            }
        }
        System.out.println("Second max number: " + secondmax);
        System.out.println();


        // 2. Вывести массив без повторяющихся чисел.
        int[] numbers2 = {3, 6, 3, 8, 9, 6, 2, 3, 5, 6};
        for (int k = 0; k < numbers2.length; k++) {
            boolean dublicate = false;
            for (int l = 0; l < k; l++) {
                if (numbers2[k] == numbers2[l]) {
                    dublicate = true;
                    break;
                }

            }
            if (!dublicate) {
                System.out.print(numbers2[k] + " ");
            }

        }
        System.out.println();
        System.out.println();

        // 3. Бонус. Найти повторяющееся число чаще всего повторяющееся в массиве и написать его количество

       int[] numbers3 = {3,6,3,8,9,6,2,3,5,3};
        int maxCount = 0;
        int mostFrequent = numbers3[0];

        for (int k = 0; k < numbers3.length; k++) {
            int count3 = 0;
            for (int l = 0; l < numbers3.length; l++) {
                if (numbers3[k] == numbers3[l]) {
                    count3++;
                }

                if (count3 > maxCount) {
                    maxCount = count3;
                    mostFrequent = numbers3[k];
                }
            }
        }
        System.out.println("Most frequent number: " + mostFrequent);
        System.out.println("Count: " + maxCount);


    }
}