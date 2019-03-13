class Validation {
    static boolean isNum(String userInput) {
        try {
            Integer.parseInt(userInput);
            return true;
        } catch (Exception exc) {
            System.out.println("Sorry, please enter a valid number");
            return false;
        }
    }

    static boolean isFlag(String userInput) {
        switch (userInput.toUpperCase()) {
            case "Y":
            case "YES":
            case "N":
            case "NO":
                return true;
            default:
                System.out.println("Sorry, I don't understand, please type in 'Y' or 'N': ");
                return false;
        }
    }
}
