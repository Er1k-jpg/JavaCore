package homework;

public class homeWork1 {
    public static void main(String[] args) {


        //1. вывести первые пять натуральные числа
        int x;
        for (x = 1; x < 6; x++) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("___________");


        //2.Сравнение двух чисел
        int i, y;
        i = 100;
        y = 200;
        if (i  < y) {
            System.out.print("i меньше y, ");
        }
        i = i * 2;
        if (i == y) {
            System.out.print("i равно y, ");
        }
        i = i * 2;
        if (i > y) {
            System.out.print("i больше y.");
        }
        System.out.println();
        System.out.print("___________");


        //3. Вывести сумму a и b
        int a = 5, b = 7, z = a + b;
        System.out.println();
        System.out.println(z);
        System.out.println("___________");


        //4. Таблица умножения для n=3
        int n=3;
        for (int s=1; s<=10; s++){
            System.out.println(n+"*"+s+"="+(n*s));
        }
    }
}