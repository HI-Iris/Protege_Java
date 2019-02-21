class PayrollGenerator {
    private static final int PERCENTAGE = 100;
    private static final float NUM_OF_MONTH = 12;

    int getGrossIncome(int salary) {
        return Math.round(salary / NUM_OF_MONTH);
    }

    int getSuperAmount(int grossIncome, int superRate) {
        return Math.round(grossIncome * superRate / PERCENTAGE);
    }

    int getIncomeTax(int annualSalary) {
        double grossTax;
        if (annualSalary <= 18200) {
            grossTax = 0;
        } else if (annualSalary <= 37000) {
            grossTax = Math.floor((annualSalary - 18200) * 0.19);
        } else if (annualSalary <= 87000) {
            grossTax = 3572 + Math.floor((annualSalary - 37000) * 0.325);
        } else if (annualSalary <= 180000) {
            grossTax = 19822 + Math.floor((annualSalary - 87000) * 0.37);
        } else {
            grossTax = 54232 + Math.floor((annualSalary - 180000) * 0.45);
        }
        return (int) Math.round(grossTax / 12);
    }
}
