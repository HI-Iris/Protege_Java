package model;

import java.util.List;

public class GameStatus {
    private Result[] results;
    private boolean isWon;

    public GameStatus(List<Result> results, boolean isWon) {
        this.results = results.toArray(new Result[0]);
        this.isWon = isWon;
    }

    public Result[] getResults() {
        return results;
    }

    public boolean isWon() {
        return isWon;
    }
}