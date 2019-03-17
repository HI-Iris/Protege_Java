import java.util.List;

public class Main {
    public static void main(String[] args) {
        MasterColorBuilder masterColorBuilder = new MasterColorBuilder();
        List<Color> masterColors = masterColorBuilder.buildColor();
        MasterMind master = new MasterMind(masterColors);



    }
}
