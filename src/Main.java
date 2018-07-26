import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setHeight(5);
        p1.setWeight(165);
        p1.bodyMassIndex();
        System.out.println(p1.bodyMassIndex());

        Person p2 = new Person();
        p2.setHeight(6);
        p2.setWeight(215);
        p2.bodyMassIndex();
        System.out.println(p2.bodyMassIndex());

        Person p3 = new Person();
        p3.setHeight(7);
        p3.setWeight(285);
        p3.bodyMassIndex();
        System.out.println(p3.bodyMassIndex());

        ArrayList<Person> groupArray = new ArrayList<>();
        groupArray.add(p1);
        groupArray.add(p2);
        groupArray.add(p3);

        groupArray.get(1).printPerson();

    }
}
