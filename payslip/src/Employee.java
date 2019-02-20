public class Employee {
    private String name;
    private String surname;
    private int salary;
    private int superRate;

    public Employee(String name, String surname, int salary, int superRate) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.superRate = superRate;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getSalary() {
        return salary;
    }

    public int getSuperRate() { return superRate; }
}