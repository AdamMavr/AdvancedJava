package Section01_JavaCollectionsFramework.Lesson08_HashcodeAndEquals;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();

        Person person1 = new Person(1, "Adam");
        Person person2 = new Person(1, "Adam");

        map.put(person1, "123");
        map.put(person2, "123");

        set.add(person1);
        set.add(person2);

        System.out.println(map); // при правильной работе мэп должен был обновить значение ключа первой персоны
        System.out.println(set); // 2 раза повторяется 1 и тот же объект. это неверно. второй должен был не добавляться тк он уже есть




//        map.put(1, "Один");
//        map.put(1, "Два");
//
//        set.add(1);
//        set.add(1);
//
//        System.out.println(map);
//        System.out.println(set);
    }
}