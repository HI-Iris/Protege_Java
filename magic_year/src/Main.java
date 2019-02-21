import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean playAgainFlag = false;
        Calculator myCalculator = new Calculator();

        do {
            System.out.println("Welcome to the magic year calculator!\n");
            Scanner userInput = new Scanner(System.in);
            System.out.print("Please enter your name:");
            String name = userInput.nextLine();
            System.out.print("Please enter your surname:");
            String surname = userInput.nextLine();

            System.out.print("Please enter your annual salary:");
            String annualSalary;
            do {
                annualSalary = userInput.nextLine();
            } while (!Validation.isNum(annualSalary));
            int monthSalary = myCalculator.getMonthSalaryByAnnualSalary(Integer.parseInt(annualSalary));

            System.out.print("Please enter your work start year:");
            String yearStartWork;
            do {
                yearStartWork = userInput.nextLine();
            } while (!Validation.isNum(yearStartWork));
            int  magicYear= myCalculator.getMagicYearByYearStartWork(Integer.parseInt(yearStartWork));

            User myUser = new User(name, surname, monthSalary, magicYear);

            System.out.println("\nYour magic age details are:");
            System.out.println(
                    String.format("Name: %s %s", myUser.getName(), myUser.getSurname()));
            System.out.println(
                    String.format("Monthly Salary: %d", myUser.getMonthSalary()));
            System.out.println(
                    String.format("Magic Year: %d", myUser.getMagicYear()));
            System.out.print("\nDo you want to calculate again?(Y/N): ");
            playAgainFlag = playAgainInputCheck(playAgainFlag, userInput);
        }
        while (playAgainFlag);
    }

    private static boolean playAgainInputCheck(boolean playAgainFlag, Scanner userInput) {
        boolean playAgainInputFlag;
        do {
            String input = userInput.next();
            String inputUpper = input.toUpperCase();
            switch (inputUpper) {
                case "Y":
                    playAgainFlag = true;
                    playAgainInputFlag = false;
                    break;
                case "N":
                    playAgainFlag = false;
                    playAgainInputFlag = false;
                    System.out.println("See you later!");
                    break;
                default:
                    System.out.print("Sorry, I don't understand, please type Y or N");
                    playAgainInputFlag = true;
            }
        } while (playAgainInputFlag);
        return playAgainFlag;
    }
}


