class Validation {
    static boolean isValid(String userInput, String regExp) {
        return userInput.matches(regExp);
    }

    static boolean isCoordsInRange(String userInput, int numOfRows, int numOfColumns) {
        String[] coords = userInput.split(" ");
        int rowFromInput = Integer.parseInt(coords[0]);
        int columnFromInput = Integer.parseInt(coords[1]);
        return rowFromInput < numOfRows && columnFromInput < numOfColumns;
    }
}
