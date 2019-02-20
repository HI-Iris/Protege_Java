class Validation {
    static boolean isNum(String strNum) {
        try {
            Integer.parseInt(strNum);
        } catch (Exception excp) {
            return false;
        }
        return true;
    }

    static boolean isDate(String strDate) {
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
            case "JAN":
            case "MAR":
            case "MAY":
            case "JUL":
            case "AUG":
            case "OCT":
            case "DEC":
                return 1 <= dayOfMonth && dayOfMonth <= 31;
            case "APR":
            case "JUN":
            case "SEP":
            case "NOV":
                return 1 <= dayOfMonth && dayOfMonth <= 30;
            case "FEB":
                return 1 <= dayOfMonth && dayOfMonth <= 29;
            default:
                return false;
        }


    }
}
