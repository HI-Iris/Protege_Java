import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean playAgainFlag = false;
        Calculator myCalculator = new Calculator();
        int mySalary = 0;
        int myYearStartWork = 0;

        do {
            System.out.println("Welcome to the magic year calculator!\n");
            Scanner userInput = new Scanner(System.in);
            System.out.print("Please enter your name:");
            String name = userInput.nextLine();
            System.out.print("Please enter your surname:");
            String surname = userInput.nextLine();

            mySalary = getMySalary(myCalculator, mySalary, userInput);
            myYearStartWork = getMyYearStartWork(myCalculator, myYearStartWork, userInput);

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
            String inputUpper = String.format(input.toUpperCase());

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

    private static int getMyYearStartWork(Calculator myCalculator, int myYearStartWork, Scanner userInput) {
        boolean isNum;
        do {
            System.out.print("Please enter your work start year:");
            String yearStartWork = userInput.nextLine();
            isNum = Validation.isNum(yearStartWork);
            if (isNum) {
                myYearStartWork = myCalculator.magicYear(Integer.parseInt(yearStartWork));
            }
        } while (!isNum);
        return myYearStartWork;
    }

    private static int getMySalary(Calculator myCalculator, int mySalary, Scanner userInput) {
        boolean isNum;
        do {
            System.out.print("Please enter your annual salary:");
            String salary = userInput.nextLine();
            isNum = Validation.isNum(salary);
            if (isNum) {
                mySalary = myCalculator.monthSalary(Integer.parseInt(salary));
            }
        } while (!isNum);
        return mySalary;
    }
}


