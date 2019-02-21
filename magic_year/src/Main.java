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

            int mySalary = getMySalary(myCalculator, userInput);
            int myYearStartWork = getMyYearStartWork(myCalculator, userInput);

            System.out.println("\nYour magic age details are:");
            System.out.println(
                    String.format("Name: %s %s", name, surname));
            System.out.println(
                    String.format("Monthly Salary: %d", mySalary));
            System.out.println(
                    String.format("Magic Year: %d", myYearStartWork));
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

    private static int getMyYearStartWork(Calculator myCalculator, Scanner userInput) {
        String yearStartWork;
        do {
            System.out.print("Please enter your work start year:");
            yearStartWork = userInput.nextLine();
        } while (!Validation.isNum(yearStartWork));
        return myCalculator.magicYear(Integer.parseInt(yearStartWork));
    }

    private static int getMySalary(Calculator myCalculator, Scanner userInput) {
        String salary;
        do {
            System.out.print("Please enter your annual salary:");
            salary = userInput.nextLine();
        } while (!Validation.isNum(salary));
        return myCalculator.monthSalary(Integer.parseInt(salary));
    }
}


