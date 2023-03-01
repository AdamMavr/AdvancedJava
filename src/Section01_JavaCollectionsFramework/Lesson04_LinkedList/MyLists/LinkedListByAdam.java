package Section01_JavaCollectionsFramework.Lesson04_LinkedList.MyLists;

import java.util.Arrays;

public class LinkedListByAdam {
    private Node head; // головной узел
    private int size; // размер списка, количество узлов

    // метод добавления узлов
    public void add(int value) {
        // инициализация головного узла
        if (head == null) {
            this.head = new Node(value);
        } else {
            Node temp = head; // временная переменная для хранения головного узла
            // цикл работает до последнего узла в цепочке
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }

            temp.setNext(new Node(value)); // в конце списка создаем новый узел со значением
        }
        size++; // увеличиваем размер списка после добавления элемента
    }

    // метод удаления узлов
    public void delete(int index) {
        // удалеие нулевого индекса
        if (index == 0) {
            head = head.next;
            size--;
            return;
        }

        int currentIndex = 0; // текущий индекс
        Node temp = head; // хранение головы

        while (temp != null) {
            if (currentIndex == index - 1) {
                temp.setNext(temp.getNext().getNext()); // удаление, не могу до конца понять как работает
                size--;
                return;
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
    }

    public String toString() {
        int[] result = new int[size];

        int index = 0;
        Node temp = head;

        while(temp != null) {
            result[index++] = temp.getValue();
            temp = temp.getNext();
        }
        return Arrays.toString(result);
    }


    // метод получения узла
    public int get(int index) {
        int currentIndex = 0;
        Node temp = head;

        while(temp != null) {
            if(currentIndex == index) {
                return temp.getValue();
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }

        throw new IllegalArgumentException();
    }


    // Класс описывающий узел
    private static class Node {
        private int value; // Значение в узле
        private Node next; // ссылка на следующий узел
        private Node prev; // ссылка на предыдущий узел

        // конструктор принимающий на вход значение
        public Node(int value) {
            this.value = value;
        }

        // геттер для значения
        public int getValue() {
            return value;
        }

        // сеттер для значения
        public void setValue() {
            this.value = value;
        }

        // геттер для ссылки на следующий узел
        public Node getNext() {
            return next;
        }

        // сеттер для ссылки на следующий узел
        public void setNext(Node next) {
            this.next = next;
        }

        // геттер для ссылки на предыдущий узел
        public Node getPrev() {
            return prev;
        }

        // сеттер для ссылки на предыдущий узел
        public void setPrev(Node prev) {
            this.prev = prev;
        }
    }
}
