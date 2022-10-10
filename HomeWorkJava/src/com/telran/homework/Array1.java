
//Напишите функцию, которая принимает массив с разными, иногда повторяющимися, числами,
// а возвращает массив состоящий только из чисел, которые повторялись.
// Порядок чисел в результирующем массиве должен соответствовать порядку
// того как повторения чисел были найден. Учитывая это обратите внимание
// на пример ниже, в выходном массиве первой идет 2 а не 3.
//
//Пример входных параметров
//array = [1, 3, 2, 2, 3, 0]
//Ожидается на выходе
//[2, 3]
package com.telran.homework;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 2, 3, 0,};

        System.out.println("Given an Array:"  + Arrays.toString(array));

        System.out.println("Array with same element: " + Arrays.toString(doubleOFTheNumbersArray(array)));
    }

    public static int[] doubleOFTheNumbersArray(int[] arr) {
        int count = 0;
        int[] tempArr = new int[arr.length];
        {
            int i = 0;
            while (i < arr.length) {
                int j = i+1;
                while (j < arr.length) {
                    if (arr[i] == arr[j]) {
                        tempArr[count] = j;
                        count++;
                        break;
                    }
                    j++;
                }
                i++;
            }
        }

        int[] resultArr = new int[count];
        System.arraycopy(tempArr, 0, resultArr, 0, count);
        Arrays.sort(resultArr);


        int i = 0;
        while (i < count) {
            tempArr[i] = arr[resultArr[i]];
            i++;
        }

        System.arraycopy(tempArr, 0, resultArr, 0, count);
        return resultArr;
    }

}
