import java.util.Scanner;

class ConstructUser {
    static User getUserDetailFromInput() {
        System.out.println("\nWelcome to the magic year calculator!\n");
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter your name:");
        String name = userInput.nextLine();
        System.out.print("Please enter your surname:");
        String surname = userInput.nextLine();
        System.out.print("Please enter your annual salary:");
        int annualSalary = getNumFromValidUserInput();
        System.out.print("Please enter your work start year:");
        int yearStartWork = getNumFromValidUserInput();
        return new User(name, surname, annualSalary, yearStartWork);
    }

    private static int getNumFromValidUserInput() {
        String userInput;
        do {
            userInput = new Scanner(System.in).nextLine();
        } while (!Validation.isNum(userInput));
        return Integer.parseInt(userInput);
    }
}
