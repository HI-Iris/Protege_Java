class Validation {
    //msg[0] userInput, msg[1] regular expression, msg[2] errorMsg (optional)
    static boolean isValid(String... msg) {
        boolean result = msg[0].matches(msg[1]);
        if (!result && msg.length == 3) {
            SysPrint.printMsg(msg[2]);
        }
        return result;
    }

    //msg[0] userInput, msg[1] errorMsg (optional)
    static boolean isCoordsInRange(int numOfRows, int numOfColumns, String... msg) {
        String[] coords = msg[0].split(" ");
        int rowFromInput = Integer.parseInt(coords[0]);
        int columnFromInput = Integer.parseInt(coords[1]);
        boolean result = rowFromInput < numOfRows && columnFromInput < numOfColumns;
        if(!result && msg.length == 2){
            SysPrint.printMsg(msg[1]);
        }
        return result;
    }
}
