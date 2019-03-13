public class Main {

    public static void main(String[] args) {
        do {
            User myUser = ConstructUser.getUserDetailFromInput();
            Calculator myCalculator =new Calculator();
            int monthSalary = myCalculator.getMonthSalaryByAnnualSalary(myUser.getAnnualSalary());
            int magicYear = myCalculator.getMagicYearByYearStartWork(myUser.getYearStartWork());
            System.out.println(BuildOutput.buildMagicYearDetails(myUser, monthSalary, magicYear));
        }
        while (!ConstructFlag.playAgainCheck());
    }
}

