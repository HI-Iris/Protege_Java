class Validation {

    static boolean isValid(String userInput, String regExp){
        return userInput.matches(regExp);
    }

    static boolean isValidBoardSize(String userInput) {
        String boardRegex = "^[0-9]+\\*[0-9]+$";
        if (userInput.matches(boardRegex)) return true;
        else {
            System.out.println("Sorry, please enter a valid board size x*y (e.g. 9*9)");
            return false;
        }
    }

    static boolean isValidCoord(String userInput) {
        String boardRegex = "^[0-9]+\\s[0-9]+$";
        if (userInput.matches(boardRegex)) return true;
        else {
            System.out.println("Sorry, please enter a valid coordinate x y (e.g. 5 6) ");
            return false;
        }
    }

    static boolean isCoordInputFinished(String userInput) {
        return userInput.equalsIgnoreCase("Q");
    }

    static boolean isCoordInRange(String userInput, int numOfRows, int numOfColumns) {
            String[] coords = userInput.split(" ");
            int rowFromInput = Integer.parseInt(coords[0]);
            int colunmFromInput = Integer.parseInt(coords[1]);
            if (rowFromInput < numOfRows && colunmFromInput < numOfColumns) return true;
            else {
                System.out.println("Sorry, the coordinate you have entered is out of range.");
                return false;
            }


    }
}
