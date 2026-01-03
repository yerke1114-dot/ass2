public class Person implements Payable, Comparable<Person> {
    private int id;
    private String name;
    private String surname;

    public Person(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }

    public String getPosition() {
        return "Student";
    }

    @Override
    public String toString() {
        return "Person: " + name + " " + surname + " (ID: " + id + ")";
    }

    @Override
    public double getPaymentAmount() {
        return 0.0;
    }

    @Override
    public int compareTo(Person other) {
        if (this.getPaymentAmount() > other.getPaymentAmount()) {
            return 1;
        } else if (this.getPaymentAmount() < other.getPaymentAmount()) {
            return -1;
        } else {
            return 0;
        }
    }
}