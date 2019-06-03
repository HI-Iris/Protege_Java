package com.myob.iris.helper;

import java.util.Scanner;

public class InputSplitter {
    public String[] splitRawInputToArray(Scanner scanner) {
        String input = scanner.nextLine();
        return input.split(" ");
    }
}
