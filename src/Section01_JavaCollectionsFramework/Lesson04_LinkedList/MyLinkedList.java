package Section01_JavaCollectionsFramework.Lesson04_LinkedList;

import java.util.Arrays;

public class MyLinkedList {
    private Node head; // Головной узел. Класс Node - это реализация узла
    private int size; // Размер списка. По умолчанию примитив int равен 0.

    // Метод add
    public void add(int value) {
        // Если это первое добавление в список, то мы инициализируем голову
        if (head == null) {
            this.head = new Node(value); // Создаем головной узел
        } else {
            Node temp = head; // Временный узел. Теперь на головной узел указывает 2 ссылки

            // Идем до последнего узла в цепочке
            // Node head это [1] и Node temp тоже (ссылка)
            // После инициализации getNext() не равняется null, соответственно мы переходим к следующему узлу
            // Когда мы будем на последнем узле getNext будет равняться null, что прекратит цикл
            // [1] -> [2] -> [3]
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }

            temp.setNext(new Node(value)); // Создаем новый узел в конце

        }

        size++; // Увеличиваем размер
    }

    // Метод get, возвращающий число и получающий в аргумент индекс числа которое мы хотим получить
    public int get(int index) {
        int currentIndex = 0; // Текущий индекс
        Node temp = head; // Переменная ссылающаяся на головной узел

        // Цикл проходящийся по узлам
        while(temp != null) {
            // Если текущий индекс равен нужному нам индексу возвращаем значение. Если нет то идем дальше и инкрементим текущий индекс
            if(currentIndex == index) {
                return temp.getValue();
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }

        throw new IllegalArgumentException(); // Исключение если индекс больше последнего доступного индекса
    }

    // Метод remove, в качестве аргумента поставляется индекс того что хотим удалить
    public void remove(int index) {
        if(index == 0) {
            head = head.getNext();
            size--;
            return;
        }
        int currentIndex = 0; // Текущий индекс
        Node temp = head; // Ссылка на голову

        // Тот же цикл
        while(temp != null) {
            // Так как этот linkedList односвязный нам нужен тот индекс, который имеет ссылку на индекс который нам надо удалить
            if(currentIndex == index - 1) {
                temp.setNext(temp.getNext().getNext()); // Удаление
                size--;
                return;
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
    }

    // Переопределяем метод toString чтобы удобно просматривать содержимое списка
    public String toString() {
        // Временный массив для хранения значений каждого узла
        int[] result = new int[size];

        int index = 0;
        Node temp = head;

        // цикл работает пока есть узлы
        while (temp != null) {
            result[index++] = temp.getValue();
            temp = temp.getNext();
        }

        return Arrays.toString(result);
    }

    // Класс описывающий узел
    private static class Node {
        private int value; // Значение, которое хранится в текущем узле
        private Node next; // Ссылка на следующий узел

        // Конструктор принимающий на вход значение
        public Node(int value) {
            this.value = value;
        }

        // Геттер для значения
        public int getValue() {
            return value;
        }

        // Сеттер для значения
        public void setValue() {
            this.value = value;
        }

        // Геттер для ссылки на следующий узел
        public Node getNext() {
            return next;
        }

        // Сеттер для ссылки на следующий узел
        public void setNext(Node next) {
            this.next = next;
        }
    }
}
