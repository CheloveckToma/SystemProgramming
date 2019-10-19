package ru.kav.systemprogramming.arraysort;

import java.util.*;

/**
 * класс arraysort выполняет сортировку по частоте
 *
 * @author Кувшинов А.В 17ИТ18
 */

public class ArraySort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{2, 5, 2, 6, -1, 99999, 5, 8, 8, 8})));
    }

    /**
     * метод sort выполянет сортировку по кол-ву вхождений
     * @param array - массив данных
     * @return отсортированный массив
     */

    private static int[] sort(int[] array) {
        HashMap<Integer, Integer> hashMap;
        hashMap = fillHashMap(array);
        String stringArray = Arrays.toString(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if ((hashMap.get(array[j]) < hashMap.get(array[j+1]) || hashMap.get(array[j]).equals(hashMap.get(array[j+1]))
                        && stringArray.indexOf(array[j] + "") > stringArray.indexOf(array[j + 1] + ""))) {
                    int c = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = c;
                }
            }
        }
        return array;
    }

    /**
     * метод fillHashMap заполняет карту (ключ, значение)
     *
     * @param array - массив с данными
     * @return заполненную карту (ключ, значение)
     */

    private static HashMap<Integer, Integer> fillHashMap(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Integer number;
        Integer frequency;

        for (int i = 0; i < array.length; i++) {
            number = array[i];
            frequency = map.get(number);
            map.put(number, frequency == null ? 1 : frequency + 1);
        }

        return map;
    }
}
