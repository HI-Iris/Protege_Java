class BuildOutput {
    static String buildMagicYearDetails(User myUser, int monthSalary, int magicYear) {
        return "\nYour magic age details are:\nName: " + myUser.getName() + " " + myUser.getSurname() +
                "\nMonthly salary: " + monthSalary +
                "\nMagic year: " + magicYear;
    }
}
