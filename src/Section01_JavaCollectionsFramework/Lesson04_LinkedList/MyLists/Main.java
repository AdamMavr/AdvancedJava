package Section01_JavaCollectionsFramework.Lesson04_LinkedList.MyLists;

public class Main {
    public static void main(String[] args) {
        ArrayListByAdam al = new ArrayListByAdam();
        al.add(1);
        al.add(13);
        al.add(1432);
        al.add(12);
        al.add(167889);

        System.out.println(al.size());
        System.out.println(al.get(2));
        al.remove(2);
        System.out.println(al.get(2));
        System.out.println(al.size());
    }
}
