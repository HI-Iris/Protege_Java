import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PayrollGenerator myPayrollGenerator = new PayrollGenerator();
        int annualSalary = 0;
        int superRate = 0;
        int grossIncome = 0;
        int incomeTax = 0;
        int superAmount = 0;
        String payStartDate;
        String payEndDate;
        boolean isNum;
        boolean isDate;

        System.out.println("\nWelcome to the payslip generator!\n");
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter your name:");
        String name = userInput.nextLine();
        System.out.print("Please enter your surname:");
        String surname = userInput.nextLine();

        do {
            System.out.print("Please enter your annual salary:");
            String salaryStr = userInput.nextLine();
            isNum = Validation.isNum(salaryStr);
            if (isNum) {
                annualSalary = Integer.parseInt(salaryStr);
                grossIncome = myPayrollGenerator.getGrossIncome(annualSalary);
                incomeTax = myPayrollGenerator.getIncomeTax(annualSalary);
            }
        } while (!isNum);

        do {
            System.out.print("Please enter your super rate:");
            String superRateStr = userInput.nextLine();
            isNum = Validation.isNum(superRateStr);
            if (isNum) {
                superRate = Integer.parseInt(superRateStr);
                superAmount = myPayrollGenerator.getSuperAmount(grossIncome, superRate);
            }
        } while (!isNum);

        Employee emp = new Employee(name, surname, annualSalary, superRate);

        do {
            System.out.print("Please enter your payment start date(e.g. 3 Mar):");
            payStartDate = userInput.nextLine();
            isDate = Validation.isDate(payStartDate);
        } while (!isDate);

        do {
            System.out.print("Please enter your payment end date(e.g. 23 Mar):");
            payEndDate = userInput.nextLine();
            isDate = Validation.isDate(payEndDate);
        }
        while (!isDate);


        System.out.println("\nYour payslip has been generated:\n");
        System.out.println(
                String.format("Name: %s %s", emp.getName(), emp.getSurname()));
        System.out.println(
                String.format("Pay Period: %s - %s", payStartDate, payEndDate));
        System.out.println(
                String.format("Gross Income: %s", grossIncome));
        System.out.println(
                String.format("Net Income: %s", grossIncome - incomeTax));
        System.out.println(
                String.format("Income Tax: %s", incomeTax));
        System.out.println(
                String.format("Super: %s", superAmount));
    }
}
