class User {
    private String name;
    private String surname;
    private int monthSalary;
    private int magicYear;

    User(String name, String surname, int monthSalary, int magicYear) {
        this.name = name;
        this.surname = surname;
        this.monthSalary = monthSalary;
        this.magicYear = magicYear;
    }

    public String toString() {
        return "\nYour magic age details are:\nName: " + this.name + " " + this.surname + "\nMonthly salary: "
                + this.monthSalary + "\nMagic year: " + this.magicYear;
    }
}
