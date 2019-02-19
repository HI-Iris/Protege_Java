import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Utility myUtility = new Utility();
        PayrollGen myPayrollGen = new PayrollGen();
        int salary = 0;
        int superRate = 0;
        int grossIncome = 0;
        int incomeTax = 0;
        int superAmount = 0;
//        String start;
//        String end;
        boolean isNum;
//        boolean isDate;

        System.out.println("Welcome to the payslip generator!\n");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Please enter your name:");
        String name = myObj.nextLine();
        System.out.print("Please enter your surname:");
        String surname = myObj.nextLine();

        do {
            System.out.print("Please enter your annual salary:");
            String salaryStr = myObj.nextLine();
            isNum = myUtility.isNum(salaryStr);
            if (isNum) {
                salary = Integer.parseInt(salaryStr);
                grossIncome = myPayrollGen.grossIncome(salary);
                incomeTax = myPayrollGen.incomeTax(salary);
            }

        } while (!isNum);

        do {
            System.out.print("Please enter your super rate:");
            String superRateStr = myObj.nextLine();
            isNum = myUtility.isNum(superRateStr);
            if (isNum) {
                superRate = Integer.parseInt(superRateStr);
                superAmount = myPayrollGen.superAmount(grossIncome, superRate);
            }
        } while (!isNum);

        Employee emp = new Employee(name, surname, salary, superRate);

//        do {
//            System.out.print("Please enter your payment start date(Day of month month):");
//            start = myObj.nextLine();
//            isDate = myUtility.isDate(start);
//        } while (!isDate);
//        do {
//            System.out.print("Please enter your payment end date:");
//            end = myObj.nextLine();
//            isDate = myUtility.isDate(end);
//        }
//        while (!isDate);


        System.out.println("\nYour payslip has been generated:\n");

        System.out.println(
                String.format("Name: %s %s", emp.getName(), emp.getSurname()));

//        System.out.println(
//                String.format("Pay Period: %s %s", start, end));

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
