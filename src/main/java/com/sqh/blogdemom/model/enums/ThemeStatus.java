package com.sqh.blogdemom.model.enums;

public enum ThemeStatus {
    THEME_NOT_ENABLED(0),
    THEME_ENABLED(1);
    private int value;

    ThemeStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
