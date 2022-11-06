import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class Main {

    public static void main(String[] args){
        List<Person> people = new ArrayList<>();
        people.add(new Person("Семён", "Захаров", 23));
        people.add(new Person("Денис", "Каруселькин", 8));
        people.add(new Person("Анна", "Захарова Попова", 28));
        people.add(new Person("Любовь", "Обручева Круглая", 15));
        people.add(new Person("Артем", "Эк Зю Пери", 27));
        people.add(new Person("Ольга", "Семенова", 17));
        people.add(new Person("Антон", "Весёлый Колобок", 35));


        Predicate<Person> lessThan = person -> person.getAge() < 18;
        people.removeIf(lessThan);

        System.out.println(people);

    }
}
