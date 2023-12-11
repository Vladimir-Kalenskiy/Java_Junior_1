package ru.geekbrains.lesson1.hw;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        /*
         * Напишите программу, которая использует Stream API для обработки списка чисел.
         * Программа должна вывести на экран среднее значение всех четных чисел в списке.
         */

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);

        List<Integer> list1 = list.stream().filter(num -> num % 2 == 0).toList();
        System.out.println("Среднее арифметическое значение всех четных чисел в списке, равняется - " +
                list1.stream().mapToInt(i -> i).sum() / list1.size());
    }
}
