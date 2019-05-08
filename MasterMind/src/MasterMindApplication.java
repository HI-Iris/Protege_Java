import Exceptions.GameMaxAttemptException;
import color.ColorBuilder;
import color.MasterColorBuilder;
import game.Referee;
import game.MasterMindStarter;
import model.Color;
import model.Result;

import java.util.Arrays;
import java.util.List;


public class MasterMindApplication {
    public static void main(String[] args) {
        ColorBuilder masterColorBuilder = new MasterColorBuilder();
        List<Color> masterColors = masterColorBuilder.buildColor();
        MasterMindStarter starter = new MasterMindStarter(masterColors, new Referee());
        while (!starter.isWon()) {
            //TODO: 1. get user input

            //TODO: 2. Parse to colors
            // pretend this is the parse inputs
            List<Color> humanColors = Arrays.asList(Color.Blue, Color.Blue, Color.Blue, Color.Blue);
            try {
                List<Result> results = starter.play(humanColors);
            } catch (GameMaxAttemptException e) {
                // TODO: 3. Tell users they have reach the attempt limits
                // Problems: should not be exception
                e.printStackTrace();
            }
        }
        // TODO: 4. The game is won when reaches this point.
    }
}
