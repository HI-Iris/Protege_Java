package service;

import java.util.List;

public interface Parser {
    <T>T getValidInput();
    void printMessage(String msg);
    void printResult(List list);
}
