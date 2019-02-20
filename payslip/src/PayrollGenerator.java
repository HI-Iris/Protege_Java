public class PayrollGenerator {
    public static final int NUM_OF_MONTH = 12;
    private double grossTax;
    private int incomeTax;

    public int grossIncome(int salary) {
        return Math.round(salary / NUM_OF_MONTH);
    }

    public int superAmount(int grossIncome, int superRate) {
        return Math.round(grossIncome * superRate / 100);
    }

    public int incomeTax(int annualSalary) {
        if (annualSalary <= 18200) {
            grossTax = 0;
        } else if (18200 < annualSalary && annualSalary <= 37000) {
            grossTax = Math.floor((annualSalary - 18200) * 0.19);
        } else if (37000 < annualSalary && annualSalary <= 87000) {
            grossTax = 3572 + Math.floor((annualSalary - 37000) * 0.325);
        } else if (87000 < annualSalary && annualSalary <= 180000) {
            grossTax = 19822 + Math.floor((annualSalary - 87000) * 0.37);
        } else {
            grossTax = 54232 + Math.floor((annualSalary - 180000) * 0.45);
        }
        incomeTax = (int) Math.ceil(grossTax / 12);
        return incomeTax;
    }
}
