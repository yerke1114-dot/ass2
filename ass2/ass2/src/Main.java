import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Employee(1, "Abai", "Kunanbayev", "Manager", 27045.78));
        people.add(new Employee(2, "Alikhan", "Bokeikhanov", "Developer", 50000.00));
        people.add(new Student(3, "Bauyrzhan", "Momyshuly", 2.5));
        people.add(new Student(4, "Manshuk", "Mametova", 3.8));

        Collections.sort(people);


        printData(people);
    }
    public static void printData(ArrayList<Person> list) {
        for (Person p : list) {
            System.out.println(p.toString() + " earns " + p.getPaymentAmount() + " tenge");
        }
    }
}