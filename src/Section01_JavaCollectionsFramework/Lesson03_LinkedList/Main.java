package Section01_JavaCollectionsFramework.Lesson03_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        masureTime(linkedList); // для записи элементов в начало листа или удаления элементов из листа целесообразнее использовать LinkedList [0] -> [1] -> [2]. Здесь чтобы получить элемент по индексу до него надо дойти через каждый узел на пути нужного элемента. Но при этом при записи элемента на первое место
        masureTime(arrayList); // для считывания элементов из ли ста или записи их в конец листа целесообразнее использовать ArrayList [0][1][2], так как найти элемент в массиве по индексу это быстро
    }

    private static void masureTime(List<Integer> list) {
        for (int i = 0; i < 100000; i++) {
            list.add(i);
            // запись элементов в ArrayList имеет такой вид:
            // [] -> [0] -> [0][1] -> [0][1][2]
            // каждый раз новое число добавляется в конец листа
            // если в качестве первого аргумента метода add передать 0,
            // то это будет обозначать индекс места куда надо вставить элемент. Второй аргумент это сам элемент
            // после этого добавление элементов в лист выглядит так:
            // [] -> [0] -> [1][0] -> [2][1][0]
            // при добавлении новых элементов в начало массива ArrayList все элементы нужно сдвинуть вправо и переписать
        }

        long start = System.currentTimeMillis(); // currentTimeMillis возвращает текущее время в миллисекундах

        for (int i = 0; i < 100000; i++) {
            list.get(i);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
