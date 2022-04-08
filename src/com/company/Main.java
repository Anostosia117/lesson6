package com.company;

public class Main {

    public static void main(String[] args) {

        // Задание 1 и 2

        int[] arr = new int[]{1, 2, 3};
        for (int h = 0; h < arr.length; h++) {
            if (h == arr.length - 1) {
                System.out.println(arr[h]);
            } else
                System.out.print(arr[h] + ", ");
        }
        for (int f = arr.length - 1; f >= 0; f--) {
            if (f >= 1) {
                System.out.print(arr[f] + ", ");
            } else
                System.out.println(arr[f]); }
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] % 2 == 0);
            else if (arr[k] % 2 != 0)
            arr[k] = arr[k] + 1;
            System.out.print(arr[k] + ", ");
        }
        System.out.println();
        float[] array = {1.57f, 7.654f, 9.986f};
        for (int d = 0; d < array.length; d++) {
            if (d == array.length - 1)
                System.out.println(array[d]);
            else
                System.out.print(array[d] + ", ");
        }
            for (int t = array.length - 1; t >= 0; t--) {
                if (t >= 1)
                    System.out.print(array[t] + ", ");
                else
                    System.out.println(array[t]);
            }
            double[] allTrue = new double[4];
            allTrue[0] = 15.4;
            allTrue[1] = 3.2;
            allTrue[2] = 87.0;
            allTrue[3] = 22.5;
            for (int i = 0; i < allTrue.length; i++) {
                if (i == allTrue.length - 1)
                    System.out.println(allTrue[i]);
                else
                    System.out.print(allTrue[i] + ", ");
            }
                for (int a = allTrue.length - 1; a >= 0; a--) {
                    if (a >= 1)
                        System.out.print(allTrue[a]+ ", ");
                    else
                        System.out.println(allTrue[a]);
  }
 }
}
