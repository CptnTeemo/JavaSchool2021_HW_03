package ru.dataart.academy.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculator {
    /**
     * @param firstNumber  - list for first number in reversed order (1 - 2 - 3 -> 321)
     * @param secondNumber - list for second number in reversed order (1 - 2 - 3 -> 321)
     * @return - sum of firstNumber + secondNumber
     */
    public Integer getSum(List<Integer> firstNumber, List<Integer> secondNumber) {
        //Task implementation
        StringBuilder firstStrNumber = new StringBuilder();
        StringBuilder secondStrNumber = new StringBuilder();
        for (int i = firstNumber.size() - 1; i >= 0; i--) {
            firstStrNumber.append(firstNumber.get(i));
        }
        for (int i = secondNumber.size() - 1; i >= 0; i--) {
            secondStrNumber.append(secondNumber.get(i));
        }
        String buffer1 = firstStrNumber.toString();
        String buffer2 = secondStrNumber.toString();
        return Integer.parseInt(buffer1) + Integer.parseInt(buffer2);
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - odd list elements
     * Example: [1, 22, 34] -> [1, 34]
     */
    public <T> List<T> getOddElements(List<T> list) {
        // Task implementation
        List<T> newList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0){
                newList.add(list.get(i));
            }
        }
        return newList;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - first and last elements of the list
     * Example: [1, 2, 3] -> [1, 3]
     * [1, 2, 3 , 4] -> [1, 4]
     */
    public <T> List<T> getBounds(List<T> list) {
        // Task implementation
        List<T> newList = new ArrayList();
        if (list.size() == 0 || list.size() == 1){
            return list;
        }
        for (int i = 0; i < list.size(); i++) {
            if (i == 0 || i == list.size() - 1) {
                newList.add(list.get(i));
            }
        }
        return newList;
    }
}
