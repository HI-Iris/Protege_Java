package com.myob.iris.model;

public class ValidationResult {
    private String reason;
    private boolean isValid;

    public ValidationResult(boolean isValid, String reason) {
        this.isValid = isValid;
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

    public boolean isValid() {
        return isValid;
    }
}
