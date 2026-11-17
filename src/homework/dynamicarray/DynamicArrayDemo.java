package homework.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        // 1. Добавить числа в массив
        DynamicArray da = new DynamicArray();
        da.add(5);
        da.add(10);
        da.add(15);

        da.print();
        System.out.println();


        // 2. Увеличить кол-во массива
        for (int i = 16; i < 50; i++) {
            da.add(i);
        }
        da.print();
        System.out.println();


        // 3. Возвратить элемент массива по указаному индексу
        DynamicArray da2 = new DynamicArray();

        da2.add(10);
        da2.add(20);
        da2.add(30);

        System.out.print(da2.getByIndex(0) + " ");
        System.out.print(da2.getByIndex(2) + " ");
        System.out.print(da2.getByIndex(5) + " ");
        System.out.print(da2.getByIndex(-1) + " ");
        System.out.println();
        System.out.println();

        // 4. Реализовать метод, который будет выводить на экран все добавленные элементы динамического массива.
        da2.add(12);
        da2.print();
        System.out.println();


        // 1.Бонус. Добавление элементов.
        DynamicArray da3 = new DynamicArray();
        for (int i = 0; i <=5; i++) {
            da3.add(i);
        }
        da3.print();
        System.out.println();


        // 2. Увеличение массива.
        for (int i = 6; i <=20; i++) {
            da3.add(i);
        }
        da3.print();
        System.out.println();

        // 3.Повторное увеличение массива
        for (int i = 21; i <=45 ; i++) {
            da3.add(i);
        }
        da3.print();
        System.out.println();


        // 4. Получение элемента по индексу

        System.out.print(da3.getByIndex(0)+" ");
        System.out.print(da3.getByIndex(45)+" ");
        System.out.print(da3.getByIndex(-6)+" ");
        System.out.print(da3.getByIndex(55)+" ");
        System.out.println();

        DynamicArray dinar = new DynamicArray();
        System.out.println(dinar.getByIndex(0));

















    }

}
