import java.util.List;

public interface Parser {
    <T>T getValidInput();
    void printMSG (String msg);
    void printList (List list);
}
