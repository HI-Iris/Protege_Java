public class Utility {
    public boolean isNum(String strNum) {
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }

    public boolean isDate(String strDate) {
        int dayOfMonth;
        String Month;
        try {
            String[] parts = strDate.split(" ");
            dayOfMonth = Integer.parseInt(parts[0]);
            Month = parts[1].toUpperCase();
        } catch (Exception excp) {
            return false;
        }
        switch (Month) {
            case "JAN": case "MAR": case "MAY": case "JUL": case "AUG": case "OCT": case "DEC":
                if (1 <= dayOfMonth && dayOfMonth <= 31) {
                    return true;
                }
                return false;
            case "APR": case "JUN": case "SEP": case "NOV":
                if (1 <= dayOfMonth && dayOfMonth <= 30) {
                    return true;
                }
                return false;
            case "FEB":
                if (1 <= dayOfMonth && dayOfMonth <= 29) {
                    return true;
                }
                return false;
        }
        return true;

    }
}
