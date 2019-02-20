public class Validation {
    static boolean isNum(String strNum) {
        try {
            Integer.parseInt(strNum);
        } catch (Exception exc) {
            return false;
        }
        return true;
    }
}
