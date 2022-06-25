package com.java.advanced.objectgetclass;

public enum Size {
    SMALL("Small Size"), MEDIUM("Medium Size"), LARGE("Large Size");

    private String displayText;

    Size(String displayText) {
        this.displayText = displayText;
    }

    public String getDisplayText() {
        return displayText;
    }
}
