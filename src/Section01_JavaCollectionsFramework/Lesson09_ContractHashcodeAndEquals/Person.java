package Section01_JavaCollectionsFramework.Lesson09_ContractHashcodeAndEquals;

import java.util.Objects;

public class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return Objects.equals(name, person.name);
    }

    // {object} -> {int} с помощью хэш-функции объект конвертируется в целое число фиксированной длинны
    // числа проще сравнивать нежели объекты, так как при сравнении объектов надо сравнивать все их поля
    // Если хэшкоды объектов равны это не значит что объекты равны
    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    /*
        Контракт hashCode() equals()
        1) у двух проверяемых объектов вызывается метод hashCode
            Если хеши разные (объекты точно разные) -> заканчиваем работу.

        2) Если хеши одинаковые (либо объекты одинаковые, либо случилась коллизия) -> вызываем метод equals.

        3) equals -> выдает ответ
     */
}
