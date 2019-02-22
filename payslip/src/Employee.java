class Employee {
    private String name;
    private String surname;
    private int salary;
    private int superRate;

    Employee(String name, String surname, int salary, int superRate) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.superRate = superRate;
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }
}