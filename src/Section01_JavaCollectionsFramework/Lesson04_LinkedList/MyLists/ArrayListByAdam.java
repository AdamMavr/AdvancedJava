package Section01_JavaCollectionsFramework.Lesson04_LinkedList.MyLists;

import java.util.Arrays;
import java.util.List;

public class ArrayListByAdam<T> {
    private T[] array; // Внутренний массив
    private int size; // Количество элеметов в массиве
    private final int DEFAULT_CAPACITY = 10; // размер массива по умолчанию

    // Консруктор задающий размер массива (прописывается в аргументах объекта)
    public ArrayListByAdam(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException();
        } else {
            array = (T[]) new Object[capacity];
        }
    }

    // Конструктор задающий размер массива по умолчанию
    public ArrayListByAdam() {
        array = (T[]) new Object[DEFAULT_CAPACITY];
    }

    //Вернуть элемент из списка по индексу
    public T get(int index) {
        return (T) array[index];
    }

    // Вернуть размер массива
    public int size() {
        return size;
    }

    // Вернуть массив

    // добавление элемента в массив
    public void add(T item ) {
        //Проверка на переполнение массива
        if(size == array.length - 1) {
            resize(array.length + 1);
        }

        array[size++] = item;
    }

    // удаление элемента из массива
    public void remove(int index) {
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
            array[size] = null;
            size--;
            return;
        }
    }


    // Масштабирование размера массива путем создания нового массива и копирования данных в него из старого массива
    public void resize(int newLength) {
        T[] newArray = (T[]) new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }
}
