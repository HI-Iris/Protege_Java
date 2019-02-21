class Validation {
    static boolean isNum(String strNum) {
        try {
            Integer.parseInt(strNum);
        } catch (Exception exc) {
            System.out.println("Sorry, please enter a valid number");
            return false;
        }
        return true;
    }
}
