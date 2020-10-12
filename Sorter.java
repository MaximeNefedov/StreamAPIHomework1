package StreamAPI.homework1;

import java.util.ArrayList;
import java.util.List;

public class Sorter {
    public List<Integer> findPositiveEvenNumber(List<Integer> inputList) {
        List<Integer> sortedList = new ArrayList<>();
        for (Integer integer : inputList) {
            if (integer > 0) {
                if(integer % 2 == 0) {
                    sortedList.add(integer);
                }
            }
        }
        return sortedList;
    }

    public List<Integer> bubbleSort(List<Integer> list) {
        int number = 0;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i - 1) > list.get(i)) {
                    number = list.get(i - 1);
                    list.set(i - 1, list.get(i));
                    list.set(i, number);
                    sorted = false;
                }
            }
        }
        return list;
    }
}
