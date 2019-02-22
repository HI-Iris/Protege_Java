import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean playAgainFlag;
        do {
            User myUser = getUserDetailFromInput();
            System.out.println(myUser.toString());
            playAgainFlag = playAgainCheck();
        }
        while (playAgainFlag);
    }

    private static int getNumFromValidUserInput() {
        String userInput;
        do {
            userInput = new Scanner(System.in).nextLine();
        } while (!Validation.isNum(userInput));
        return Integer.parseInt(userInput);
    }

    private static User getUserDetailFromInput() {
        Calculator myCalculator = new Calculator();
        System.out.println("\nWelcome to the magic year calculator!\n");
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter your name:");
        String name = userInput.nextLine();
        System.out.print("Please enter your surname:");
        String surname = userInput.nextLine();
        System.out.print("Please enter your annual salary:");
        int annualSalary = getNumFromValidUserInput();
        int monthSalary = myCalculator.getMonthSalaryByAnnualSalary(annualSalary);
        System.out.print("Please enter your work start year:");
        int yearStartWork = getNumFromValidUserInput();
        int magicYear = myCalculator.getMagicYearByYearStartWork(yearStartWork);
        return new User(name, surname, monthSalary, magicYear);
    }


    private static boolean getValidFlagFromUserInput(Scanner userInput) {
        boolean playAgainFlag;
        boolean isFlagValid;
        do {
            switch (userInput.nextLine().toUpperCase()) {
                case "Y":
                case "YES":
                    playAgainFlag = true;
                    isFlagValid = true;
                    break;
                case "N":
                case "NO":
                    playAgainFlag = false;
                    isFlagValid = true;
                    break;
                default:
                    System.out.println("Sorry, I don't understand, please type in 'Y' or 'N'");
                    playAgainFlag = false;
                    isFlagValid = false;
            }
        } while (!isFlagValid);
        return playAgainFlag;
    }

    private static boolean playAgainCheck() {
        System.out.println("Do you want to calculate again?");
        return getValidFlagFromUserInput(new Scanner(System.in));
    }
}

