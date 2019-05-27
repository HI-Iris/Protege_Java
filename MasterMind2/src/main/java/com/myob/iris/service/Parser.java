package com.myob.iris.service;

import java.util.Scanner;

public class Parser {
    public String[] parseRawInputToList(Scanner scanner) {
        String input = scanner.nextLine();
        return input.split(" ");
    }
}
