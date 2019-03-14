class Validation {
    static boolean isColor(String userInput) {
        for (Color color : Color.values())
            if (userInput.toUpperCase().equals(color.name().toUpperCase())) {
                return true;
            }
        return false;
    }
}
