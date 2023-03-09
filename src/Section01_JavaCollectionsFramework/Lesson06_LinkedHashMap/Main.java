package Section01_JavaCollectionsFramework.Lesson06_LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>(); // внутри не гарантируется никакого порядка
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); // в каком порядке пары были добавлены в таком и будут получены обратно
        Map<Integer, String> treeMap = new TreeMap<>(); // пары сортируются по ключу от меньшего к большему

        testMap(hashMap);
        testMap(linkedHashMap);
        testMap(treeMap);
    }

    public static void  testMap(Map<Integer, String> map) {
        map.put(39, "Adam");
        map.put(19, "Vella");
        map.put(393, "Elena");
        map.put(3, "Oleg");
        map.put(0, "Sirius");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
