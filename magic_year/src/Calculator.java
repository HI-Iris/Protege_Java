class Calculator {
    private static final float NUM_OF_MONTH = 12;
    private static final int MAGIC_YEAR = 65;

    int getMagicYearByYearStartWork(int yearStartWork) {
        return yearStartWork + MAGIC_YEAR;
    }

    int getMonthSalaryByAnnualSalary(int annualSalary) {
        return Math.round(annualSalary / NUM_OF_MONTH);
    }
}
