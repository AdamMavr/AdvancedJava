package Section01_JavaCollectionsFramework.Lesson04_LinkedList.MyLists;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayListByAdam al = new ArrayListByAdam();
        LinkedListByAdam ll = new LinkedListByAdam();
        ll.add(34);
        ll.add(453543654);
        ll.add(7734);
        ll.add(315534);
        al.add(1);
        al.add(13);
        al.add(1432);
        al.add(12);
        al.add(167889);

        System.out.println(ll.get(1));
        System.out.println(ll.get(1));
        System.out.println(ll.toString());
    }
}
