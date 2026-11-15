package Homework;

public class homework2 {
    public static void main(String[] args) {
        for (int n = 0; n < 5; n++) {
            for (int k = 0; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();




        for (int n = 1; n <= 5; n++) {
            for (int k = 1; k <= 5 - n; k++) {
                System.out.print("  ");
            }

            for (int i = 1; i <= n; i++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();




        for (int n = 5; n > 0; n--) {
            for (int k = 0; k < n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();





        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();




        for (int n = 1; n <= 5; n++) {
            for (int j = 0; j < 5 - n; j++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }



        for (int i = 4; i >0 ; i--) {
            for (int j = 0; j < 5-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}