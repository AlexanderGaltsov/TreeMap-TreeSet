import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Person> people = new ArrayList<>();
        people.add(new Person("Семён", "Захаров", 23));
        people.add(new Person("Анна", "Захарова Попова", 28));
        people.add(new Person("Артем", "Эк Зю Пери", 27));
        people.add(new Person("Антон", "Весёлый Колобок", 35));

        Collections.sort(people, new PersonComparator(2));
        System.out.println(people);

    }

}
