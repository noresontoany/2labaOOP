package task_9;

import java.util.Scanner;

public class Array_9 {
    private final int[][] a;
    public Array_9()
    {

        this.a = new int[3][3];
    }
    public Array_9(int[][] arr)
    {
        this.a=arr;
    }
    public void fill_array() {

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = in.nextInt();
            }
        }


        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.printf("%d ", anInt);
            }
            System.out.println();
        }
    }
    public void check_array() {
        int temp;
        for (int i = 0; i < a.length; i++) {
            if (a[i][0] < a[i][a[0].length - 1]) {

                temp = a[i][0];
                a[i][0] = a[i][a[0].length - 1];
                a[i][a[0].length - 1] = temp;
            }
        }
        System.out.print("Перестановка" + "\n");
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.printf("%d ", anInt);
            }
            System.out.println();
        }
    }
    public void new_array() {

        int count =0;
        for (int i = 1; i <= a.length; i++) {
            if(i % 2 == 0){
                count++;
            }
        }
        int[][] new_arr = new int[count][a[0].length];
        if(count >= 1) {

            int t = 0;
            for (int k = 0; k < a.length; k++) {

                if ((k + 1) % 2 == 0) {
                    System.arraycopy(a[k], 0, new_arr[t], 0, a[k].length);
                    t++;
                }
            }
            System.out.print("Новый" + "\n");
            for (int[] ints : new_arr) {
                for (int anInt : ints) {
                    System.out.printf("%d ", anInt);
                }
                System.out.println();
            }
        }
        else {
            System.out.print("ОШИБКА");
        }
    }
    public void min_elem(){
        int min = 0;
        boolean f = true;
        for (int[] ints : a) {
            for (int anInt : ints) {
                if (anInt > 0) {
                    if (f) {
                        min = anInt;
                        f = false;
                    }
                    if (anInt < min) {
                        min = anInt;
                    }
                }
            }

        }

        if(min > 0){
            System.out.print(min+"\n");
        }
        else{
            System.out.print("таких чисел нет"+"\n");
        }

    }
}
