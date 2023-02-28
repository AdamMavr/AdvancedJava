package Section01_JavaCollectionsFramework.Lesson04_LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyLinkedList mls = new MyLinkedList();
        mls.add(23);
        mls.add(2356);
        mls.add(65);
        mls.add(2);

        System.out.println(mls);
        System.out.println(mls.get(2));
        mls.remove(1);
        System.out.println(mls);
    }
}
