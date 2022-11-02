import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final int maxLen = 3;

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Семён", "Захаров", 23));
        people.add(new Person("Анна", "Захарова Попова", 28));
        people.add(new Person("Артем", "Эк Зю Пери", 27));
        people.add(new Person("Антон", "Весёлый Колобок", 35));

        people.sort((p1, p2) -> {
            int len1 = p1.getSurname().split(" ").length;
            int len2 = p2.getSurname().split(" ").length;
            if (Math.min(len1, maxLen) != Math.min(len2, maxLen)) {
                return Integer.compare(len1, len2);
            }
            return Integer.compare(p1.getAge(), p2.getAge());
        });

        System.out.println(people);
    }


}
