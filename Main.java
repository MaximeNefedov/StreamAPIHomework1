package StreamAPI.homework1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        System.out.println(list);

        Sorter sorter = new Sorter();

        List<Integer> sortedList = sorter.findPositiveEvenNumber(list);
        System.out.println("Четные положительные числа: " + sortedList);

        List<Integer> straightSortList = sorter.bubbleSort(sortedList);
        System.out.println("Четные положительные числа в порядке возрастания: " + straightSortList);

        System.out.println("----------------------------");
        System.out.println("Реализация через Stream API:");
        list.stream()
                .filter(v -> v > 0)
                .filter(v -> v % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(v -> System.out.print(v + " "));

    }
}
