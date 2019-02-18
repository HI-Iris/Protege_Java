

public class Utility {
    public boolean isNum(String strNum) {
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }

    public int magicYear(int year){
        int magicYear = year + 65;
        return  magicYear;
    }

    public int monthSalary(int salary){
        int monthSalary = Math.round(salary / 12);
        return monthSalary;
    }
}