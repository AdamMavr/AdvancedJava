package Section01_JavaCollectionsFramework.Lesson08_HashcodeAndEquals;

import java.util.Objects;

public class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    // так как на созданный нами объект методы hashcode и equals сравнивают объекты по ссылкам на участки в памяти
    // надо переопределить эти методы в нашем объекте person. тогда сравнение будет работать корректно и дубликатов не будет
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
