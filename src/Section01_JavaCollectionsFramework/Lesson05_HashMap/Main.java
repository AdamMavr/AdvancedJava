package Section01_JavaCollectionsFramework.Lesson05_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // мтод put добавляет ключи и значения, их надо перечислять в аргументах через запятую
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // цикл foreach для hashmap
        // Entry это пара ключ значение. это рассматривается как своя структура данных, а не отдельный ключ и отдельное значение
        // entrySet - возвращает все пары ключ значение в данной map
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
