import java.util.Scanner;

class ConstructFlag {
    private static String getFlagStringFromValidUserInput() {
        String userInput;
        do {
            userInput = new Scanner(System.in).nextLine();
        } while (!Validation.isFlag(userInput));
        return userInput;
    }

    private static boolean mapFlagWithFlagString(String flagString) {
        switch (flagString) {
            case "Y":
            case "YES":
                return true;
            default:
                return false;
        }
    }

    static boolean playAgainCheck() {
        System.out.println("\nDo you want to calculate again? (Y / N)");
        String flagString = getFlagStringFromValidUserInput();
        return mapFlagWithFlagString(flagString);
    }
}
