public class Calculator {
    private static final float NUM_OF_MONTH = 12;
    private static final int MAGIC_YEAR = 65;

    int magicYear(int yearStartWork) {
        return yearStartWork + MAGIC_YEAR;
    }

    int monthSalary(int annualSalary) {
        return Math.round(annualSalary / NUM_OF_MONTH);
    }
}
