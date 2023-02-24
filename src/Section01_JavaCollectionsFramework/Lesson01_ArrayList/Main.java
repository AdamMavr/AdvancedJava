package Section01_JavaCollectionsFramework.Lesson01_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Все классы в коллекции параметризованы, и при создании объекта необходимо указать параметр, то есть тот тип объекта который будет храниться в коллекции
        // в параметрах ArrayList нельзя указывать примитивы
        // Когда мы используем класс из коллекций, когда создаем объект этого класса,
        // лучше ссылать ArrayList на переменную List
        // ArrayList<Integer> arrayList = new ArrayList<>(); можно так, но лучше как ниже,
        // потому что класс ArrayList реализует интерфейс List
        // Согласно конфенции мы хотим ссылать объекты класса на интерфейс который этот класс реализует
        // Это работает благодаря полиморфизму и upcasting`у
        // Это будет полезно, например, при удалении большого количества элементов, чтобы было легче сослать переменную на LinkedList
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            arrayList.add(i); // метод add добавляет элементы в ArrayList. в аргументы поставляется элемент.
        }

        // Проходимся по всем элементам ArrayList
        for (int i = 0; i < arrayList.size(); i ++) {
            System.out.println(arrayList.get(i));
        }

        // Проходимся по всем элементам ArrayList с помощью foreach
        for (Integer x : arrayList) {
            System.out.println(x);
        }

            System.out.println(arrayList);

        // Метод get позволяет получать элемент из массива, в аргументы поставляется индекс элемента
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(9));

        // Метод size позволяет узнать размер листа
        System.out.println(arrayList.size());

        // Метод remove позволяет удалять элемент
        // Этот метод неэффективен если удаляется элемент в середине,
        // так как он сокращает длину массива и перемещает все элементы влево из-за пустоты на месте удаленного элемента
        // [1, 2, 3, 4, 5] -> [1, 2, , 4, 5] -> [1, 2, 4, 5]
        // Для решения этой проблемы используется LinkedList
        arrayList.remove(5);
        System.out.println(arrayList);
    }
}
