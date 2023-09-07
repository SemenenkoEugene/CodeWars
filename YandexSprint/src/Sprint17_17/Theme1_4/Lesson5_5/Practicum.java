package Sprint17_17.Theme1_4.Lesson5_5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Dog implements Comparable<Dog> {

    private final String nickname;

    public Dog(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(nickname, dog.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname);
    }

    @Override
    public String toString() {
        return nickname;
    }

    @Override
    public int compareTo(Dog o) {
        return this.nickname.compareTo(o.nickname);
    }

    /* Вам предстоит реализовать метод compareTo и, возможно, equals —
    подумайте, какая между ними связь. */
}

public class Practicum {

    public static void main(String[] args) {
        List<Dog> unsortedDogs = Stream.of(
                        "Дружок", "Пушок", "Тузик", "Ромео",
                        "Белка", "Стрелка", "Бобик", "Афоня",
                        "Волчок")
                .map(Dog::new)
                .collect(Collectors.toList());

        // найдите Белку
        Dog dog = new Dog("Белка");
        String result = search(unsortedDogs, dog)
                .map(d -> "А вот и собака по кличке " + d + " нашлась")
                .orElseGet(() -> "Нет собаки по кличке " + dog + " :(");

        System.out.println(result);
    }

    private static <T extends Comparable<T>> Optional<T> search(List<T> unsortedList, T searchObject) {
        List<T> sortedList = new ArrayList<>(unsortedList);
        Collections.sort(sortedList);// искать легче по упорядоченному списку — вам поможет алгоритм сортировки
        int idx = Collections.binarySearch(sortedList, searchObject);
        T result = idx >= 0 ? sortedList.get(idx) : null;
        return Optional.ofNullable(result);// найдите Белку, учтите, что idx может быть -1, если ничего не нашлось.

    }

    // методы сортировки и поиска
}
