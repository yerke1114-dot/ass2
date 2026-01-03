public class Student extends Person {

    private double gpa;
    private static final double STIPEND =52000.00;
    public Student() {
        super();
    }
    public Student(int id, String name, String surname, double gpa) {
        super(id, name, surname);
        this.gpa = gpa;
    }
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public double getPaymentAmount() {
        if (gpa > 2.67) {
            return STIPEND;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Student: " + getId() + ". " + getName() + " " + getSurname();
    }
}
