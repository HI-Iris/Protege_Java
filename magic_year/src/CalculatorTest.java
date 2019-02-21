import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
    private Calculator testCalculator = new Calculator();

    public void testMagicYear() {
        int yearStartWork = 0;
        assertEquals(65, testCalculator.magicYear(yearStartWork));
    }

    public void test_round_produce_$1_when_the_month_salary_is_50c() {
        int annualSalary = 6;
        assertEquals(1, testCalculator.monthSalary(annualSalary));
    }

    public void test_round_produce_$0_when_the_month_salary_is_25c() {
        int annualSalary = 3;
        assertEquals(0, testCalculator.monthSalary(annualSalary));
    }

    public void test_round_produce_$0_when_the_month_salary_is_neg25c() {
        int annualSalary = -3;
        assertEquals(0, testCalculator.monthSalary(annualSalary));
    }

    public void test_round_produce_$0_when_the_month_salary_is_neg() {
        int annualSalary = -15;
        assertEquals(-1, testCalculator.monthSalary(annualSalary));
    }
}