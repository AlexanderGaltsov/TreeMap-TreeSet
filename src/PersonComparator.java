import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    private int maxLen;

    public PersonComparator(int maxLen) {
        this.maxLen = maxLen;
    }

    @Override
    public int compare(Person p1, Person p2) {
        int len1 = p1.getSurname().split(" ").length;
        int len2 = p2.getSurname().split(" ").length;
        if (Math.min(len1, maxLen) != Math.min(len2, maxLen)) {
            return Integer.compare(len1, len2);
        }
        return Integer.compare(p1.getAge(), p2.getAge());
    }

}
