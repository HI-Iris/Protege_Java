package com.myob.iris.model;

import java.util.Optional;

public class Result {
    private boolean isValid;
    private Optional<String> reason;

    private Result() {
        this.isValid = true;
        this.reason = Optional.empty();
    }

    private Result(String reason) {
        this.isValid = false;
        this.reason = Optional.ofNullable(reason);
    }

    public static Result valid() {
        return new Result();
    }

    public static Result invalid(String reason) {
        return new Result(reason);
    }

    public boolean isValid() {
        return isValid;
    }

    public Optional<String> getReason() {
        return reason;
    }
}
