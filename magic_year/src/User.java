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
    String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    int getMonthSalary() {
        return monthSalary;
    }
    public void setMonthSalary(int monthSalary) {
        this.monthSalary = monthSalary;
    }
    int getMagicYear() {
        return magicYear;
    }
    public void setMagicYear(int magicYear) {
        this.magicYear = magicYear;
    }
}
