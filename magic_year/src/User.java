class User {
    private String name;
    private String surname;
    private int annualSalary;
    private int yearStartWork;

    User(String name, String surname, int annualSalary, int yearStartWork) {
        this.name = name;
        this.surname = surname;
        this.annualSalary = annualSalary;
        this.yearStartWork = yearStartWork;
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    public int getYearStartWork() {
        return yearStartWork;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
