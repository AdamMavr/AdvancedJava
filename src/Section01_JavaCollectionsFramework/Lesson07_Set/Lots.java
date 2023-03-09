package Section01_JavaCollectionsFramework.Lesson07_Set;

import java.util.HashSet;
import java.util.Set;

public class Lots {
    public static void main(String[] args) {
        Set<Integer> firstSet = new HashSet<>();

        firstSet.add(0);
        firstSet.add(1);
        firstSet.add(2);
        firstSet.add(3);
        firstSet.add(4);
        firstSet.add(5);

        Set<Integer> secondSet = new HashSet<>();

        secondSet.add(2);
        secondSet.add(3);
        secondSet.add(4);
        secondSet.add(5);
        secondSet.add(6);
        secondSet.add(7);

        //union - объединение множеств
        Set<Integer> unionSet = new HashSet<>(firstSet); // addAll добавляет сет в аргументах в сет вызывающий метод
        unionSet.addAll(secondSet);
        System.out.println(unionSet );

        // intersection - пересечение множеств
        Set<Integer> intersection = new HashSet<>(firstSet);
        intersection.retainAll(secondSet); // retainAll оставляет в сете 1 все элементы которые есть в сете 2
        System.out.println(intersection);

        // difference - разность множеств
        Set<Integer> difference = new HashSet<>(firstSet);
        difference.removeAll(secondSet); // removeAll - из первого сета удаляется все что есть во втором
        System.out.println(difference);
    }
}
