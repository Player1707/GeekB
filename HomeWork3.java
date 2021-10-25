package ua.geekbrains.java.yaroslav_nechval.home_work3;

import java.util.Arrays;

public class HomeWork3 {

    public static void main(String[] args) {
        int[] c = new int[]{0, 1, 0, 1, 0, 1, 0, 1};
        Swap(c);
        int[] v = new int[101];
        AddNumber(v);
        int[] m = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        ScaleNumber(m);
        int[][] table = new int[5][5];
        Cube(table);
        int[] g = new int[8];
        Infest(g,7);
        int[] j = new int[]{5,10,1,5,8};
        FiND(j);
        int[] l = new int[]{1,1,5,3,1,2};
        System.out.println(Bal(l));
        shiftArray(l,-2);
        System.out.println(Arrays.toString(l));

    }

    public static void Swap(int[] c) {
        int[] k = new int[c.length];
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 0) {
                k[i] = c[i] + 1;
            } else {
                k[i] = c[i] - 1;
            }
        }
        System.out.println(Arrays.toString(k));
    }

    public static void AddNumber(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = i;
        }
        System.out.println(Arrays.toString(v));
    }

    public static void ScaleNumber(int[] m) {
        int[] f = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            if (m[i] < 6) {
                f[i] = m[i] * 2;
            } else {
                f[i] = m[i];
            }
        }
        System.out.println(Arrays.toString(f));
    }

    public static void Cube(int[][] r) {
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r[i].length; j++) {
                if(r[i] == r[j]){
                    r[i][j] = 1;
                    System.out.print(r[i][j] + " ");
                }else if (i + j == r.length - 1){
                    r[i][j] = 1;
                    System.out.print(r[i][j] + " ");
                }else {
                    r[i][j] = 0;
                    System.out.print(r[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void Infest (int[] let, int initialValue){
        for(int i = 0 ; i < let.length; i++){
          let[i] = initialValue;
        }
        System.out.println(Arrays.toString(let));
    }

    public static void FiND (int[] num){
        int max = 0;
        for(int i = 0; i < num.length; i++){
            if(max <= num[i]){
                max = num[i];
            }else {
                max = Math.max(max,num[i]);
            }
        }
        System.out.println("Max number " + max);
    }

    public static boolean Bal (int[] numbers){
        int sum1 = 0;
        for(int i = 0; i < numbers.length; i++){
            sum1 += numbers[i];
        }

        int sum2 = 0;
        for(int i = 0; i < numbers.length - 1; i++){
            if(sum1 == sum2){
                return true;
            }else if(sum1 < sum2){
                return false;
            }else {
                sum1 = sum1 - numbers[i];
                sum2 += numbers[i];
            }
        }
        return true;
    }

    public static int[] shiftArray(int[] incomingArray, int shift) {
        if(shift != 0){

            int finalShift;
            if (shift > incomingArray.length){
                shift = Math.abs(shift % incomingArray.length);
            }
            else {
                finalShift = shift;
            }

            // в зависимости от знака сдвига движение будет происходить
            if (shift > 0) {
                for (int n = 0; n < shift; n++) {
                    // убираем первый элемент в буфер, а на его место ставим хвостовой элемент
                    int buffer = incomingArray[0];
                    incomingArray[0] = incomingArray[incomingArray.length - 1];

                    // циклично сдвигаем весь массив
                    for (int j = 1; j < incomingArray.length - 1; j++) {
                        incomingArray[incomingArray.length - j] = incomingArray[incomingArray.length - j - 1];
                    }

                    // ставим буферный элемент в 1 ячейку
                    incomingArray[1] = buffer;
                }
            }
            else if (shift < 0) {
                for (int i = 0; i > shift; i--) {
                    int buffer = incomingArray[incomingArray.length - 1];
                    incomingArray[incomingArray.length - 1] = incomingArray[0];

                    for (int j = 1; j < incomingArray.length - 1; j++) {
                        incomingArray[j - 1] = incomingArray[j];
                    }

                    incomingArray[incomingArray.length - 2] = buffer;
                }
            }
        }

        return incomingArray;
    }

    }


