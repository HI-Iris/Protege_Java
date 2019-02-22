import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean playAgainFlag = false;
        do {
            User myUser = getUserDetailFromInput();
            System.out.println(myUser.toString());
            System.out.print("\nDo you want to calculate again?(Y/N): ");
            playAgainFlag = playAgainInputCheck(playAgainFlag, new Scanner(System.in));
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
                    System.out.println("Sorry, I don't understand, please type Y or N");
                    playAgainInputFlag = true;
            }
        } while (playAgainInputFlag);
        return playAgainFlag;
    }
}


