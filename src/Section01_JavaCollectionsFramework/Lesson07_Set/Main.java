package Section01_JavaCollectionsFramework.Lesson07_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>(); // нет никакого порядка
        Set<String> linkedHashSet = new LinkedHashSet<>(); // сохраняется порядок ввода
        Set<String> treeSet = new TreeSet<>(); // сортировка естественным порядком

        hashSet.add("Adam");
        hashSet.add("Vella");
        hashSet.add("Elena");
        hashSet.add("Oleg");
        hashSet.add("Sirius");

        // метод contains позволяет определить есть ли то или иное значение в множестве
        System.out.println(hashSet.contains("Adam"));
        System.out.println(hashSet.contains("Karl"));

        // метод isEmpty - проверка на пустоту сета
        System.out.println(hashSet.isEmpty());



        // union - объединение множеств

    }
}
