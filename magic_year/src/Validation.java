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
}
