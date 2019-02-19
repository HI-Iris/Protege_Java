import java.util.Date;

public class PayrollGen {
    private double grossTax;
    private int incomeTax;
    private int grossIncome;
    private int superAmount;


    public int grossIncome(int salary) {
        grossIncome = Math.round(salary / 12);
        return grossIncome;
    }

    public int superAmount(int grossIncome, int rate) {
        superAmount = Math.round(grossIncome * rate / 100);
        return superAmount;
    }

    public int incomeTax(int salary) {
        if (salary <= 18200) {
            grossTax = 0;
        } else if (18200 < salary && salary <= 37000) {
            grossTax = Math.floor((salary - 18200) * 0.19);
        } else if (37000 < salary && salary <= 87000) {
            grossTax = 3572 + Math.floor((salary - 37000) * 0.325);
        } else if (87000 < salary && salary <= 180000) {
            grossTax = 19822 + Math.floor((salary - 87000) * 0.37);
        } else {
            grossTax = 54232 + Math.floor((salary - 180000) * 0.45);
        }
        incomeTax = (int) Math.ceil(grossTax / 12);
        return incomeTax;
    }


}
