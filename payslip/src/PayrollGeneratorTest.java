import junit.framework.TestCase;

public class PayrollGeneratorTest extends TestCase {
    private PayrollGenerator myPayroll = new PayrollGenerator();

    public void test_grossIncome_is_$1_when_annualSalary_is_50c() {
        int annualSalary = 6;
        assertEquals(1, myPayroll.getGrossIncome(annualSalary));
    }

    public void test_grossIncome_is_$0_when_annualSalary_is_25c() {
        int annualSalary = 3;
        assertEquals(0, myPayroll.getGrossIncome(annualSalary));
    }

    public void test_grossIncome_is_$0_when_annualSalary_is_neg25c() {
        int annualSalary = -3;
        assertEquals(0, myPayroll.getGrossIncome(annualSalary));
    }

    public void test_grossIncome_is_$0_when_annualSalary_is_neg() {
        int annualSalary = -15;
        assertEquals(-1, myPayroll.getGrossIncome(annualSalary));
    }

    public void test_superAmount_is_$487_when_grossIncome_is_$5417_superRate_is_9() {
        int grossIncome = 5417;
        int superRate = 9;
        assertEquals(487,myPayroll.getSuperAmount(grossIncome, superRate));
    }

    public void test_superAmount_is_$135_when_grossIncome_is_$1500_superRate_is_9() {
        int grossIncome = 1500;
        int superRate = 9;
        assertEquals(135,myPayroll.getSuperAmount(grossIncome, superRate));
    }

    public void test_incomeTax_is_$0_when_annualSalary_is_$18000() {
        int annualSalary = 18000;
        assertEquals(0, myPayroll.getIncomeTax(annualSalary));
    }

    public void test_incomeTax_is_$187_when_annualSalary_is_$30000() {
        int annualSalary = 30000;
        assertEquals(187, myPayroll.getIncomeTax(annualSalary));
    }

    public void test_incomeTax_is_$1056_when_annualSalary_is_$65000() {
        int annualSalary = 65000;
        assertEquals(1056, myPayroll.getIncomeTax(annualSalary));
    }

    public void test_incomeTax_is_$1462_when_annualSalary_is_$80000() {
        int annualSalary = 80000;
        assertEquals(1462, myPayroll.getIncomeTax(annualSalary));
    }

    public void test_incomeTax_is_$5269_when_annualSalary_is_$200000() {
        int annualSalary = 200000;
        assertEquals(5269, myPayroll.getIncomeTax(annualSalary));
    }
}