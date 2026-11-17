package homework;
public class CharArrayUtil {
    public static void main(String[] args) {
        char[] chars = {'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n', '!'};
        // 1. Напечатать массив.
        for (char aChar : chars) {
            System.out.print(aChar);
        }
        System.out.println();
        System.out.println();


        // 2. Напечатать кол-во символов в массиве, первый и последний символ.
        System.out.println("Characters count: " + chars.length);
        System.out.println("First character: " + chars[0]);
        System.out.println("Last character: " + chars[chars.length - 1]);
        System.out.println();


        // 3. Посчитать кол-во буквы "а" в массиве.
        int count = 0;
        char c = 'a';
        for (int i = 0; i < chars.length; i++) {
            if (c == chars[i]) {
                count++;
            }
        }
        System.out.println("Character 'a' count: " + count);
        System.out.println();


        // 4. Подсчитать кол-во гласных букв.
        int count1 = 0;

        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] == 'a') || (chars[i] == 'e') || (chars[i] == 'i') || (chars[i] == 'o') || (chars[i] == 'u') || (chars[i] == 'A') || (chars[i] == 'E') || (chars[i] == 'I') || (chars[i] == 'O') || (chars[i] == 'U')) {
                count1++;
            }
        }
        System.out.println("Vowels count: " + count1);
        System.out.println();


        // 5. Подсчитать кол-во согласных букв в массиве.
        int count2 = 0;

        for (int i = 0; i < chars.length; i++) {

            if ((chars[i] >= 'a' && chars[i] <= 'z' || chars[i] >= 'A' && chars[i] <= 'Z') && chars[i] != 'a' && chars[i] != 'e' && chars[i] != 'i' && chars[i] != 'o' && chars[i] != 'u' && chars[i] != 'A' && chars[i] != 'E' && chars[i] != 'I' && chars[i] != 'O' && chars[i] != 'U') {
                count2++;
            }
        }
        System.out.println("Consonants count: " + count2);
        System.out.println();


        // 6. Подсчитать кол-во пробелов в массиве.

        int count3 = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                count3++;
            }
        }
        System.out.println("Spaces count: " + count3);
        System.out.println();


        // 7. Перевернутый массив.
        int k = 0;
        int j = chars.length - 1;
        while (k < j) {
            char temp = chars[k];
            chars[k] = chars[j];
            chars[j] = temp;
            k++;
            j--;
        }
        for (char char1 : chars) {
            System.out.print(char1 + " ");
        }
        System.out.println();

        k = 0;
        j = chars.length - 1;
        while (k < j) {
            char temp = chars[k];
            chars[k] = chars[j];
            chars[j] = temp;
            k++;
            j--;
        }
        for (char char1 : chars) {
            System.out.print(char1 + " ");
        }
        System.out.println();
        System.out.println();


        // 8. Преобразить все буквы массива сначала в заглавные, а потом в строчные.
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) (chars[i] - 32);
            }
        }
        System.out.print("Uppercase: ");

        for (char char1 : chars) {
            System.out.print(char1);
        }
        System.out.println();


        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] + 32);
            }
        }
        System.out.print("Lowercase: ");

        for (char char1 : chars) {
            System.out.print(char1);
        }

        System.out.println();
        System.out.println();


        // 9. Заменить в массиве букву "а" на "*".
        char oldChar = 'a';
        char newChar = '*';
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == oldChar) {
                chars[i] = newChar;
            }
        }
        for (char newChars : chars) {
            System.out.print(newChars);
        }
        System.out.println();
        System.out.println();


        // 10. Проверить палиндром.
        char[] chars1 = {'l', 'e', 'v', 'e', 'l'};
        boolean palindrome = true;

        for (int i = 0; i < chars1.length / 2; i++) {
            if (chars1[i] != chars1[chars1.length - 1 - i]) {
                palindrome = false;
            }

        }
        System.out.println("Is palindrome: " + palindrome);

        char[] chars2 = {'h', 'e', 'l', 'l', 'o'};

        for (int i = 0; i < chars2.length / 2; i++) {
            if (chars2[i] != chars2[chars2.length - 1 - i]) {
                palindrome = false;
            }

        }
        System.out.println("Is palindrome: " + palindrome);
        System.out.println();


        // 1. Бонус. Найти первое повторяющийся символ.
        char[] char1 = {'a', 'b', 'c', 'a', 'd'};
        char target = 'a';
        int index = -1;

        for (int i = 0; i < char1.length; i++) {
            if (char1[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println("First index: " + index);
        System.out.println();


        // 2. Бонус.  Сравнить два массива char
        char[] first = {'J', 'a', 'v', 'a'};
        char[] second = {'J', 'a', 'v', 'a'};

        boolean equal = true;

        for (int i = 0; i < first.length; i++) {
            if (first[i] == second[i]) {
                equal = false;
            }
        }
        System.out.println("Arrays are equal: " + equal);
        System.out.println();


        // 3. Бонус. Удалить повторяющиеся символы

        char[] chars3 = {'a', 'b', 'a', 'c', 'b', 'd', 'a'};

        for (int i = 0; i < chars3.length; i++) {
            boolean duplicate = false;
            for (int l = 0; l < i; l++) {
                if (chars3[i] == chars3[l]) {
                    duplicate = true;
                }

            }
            if (duplicate == false) {
                System.out.print(chars3[i] + " ");
            }
        }


    }
}


