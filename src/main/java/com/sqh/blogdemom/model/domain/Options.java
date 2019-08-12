package com.sqh.blogdemom.model.domain;

public class Options {
    private String optionName;
    private String optionValue;

    public Options() {
    }

    public Options(String optionName, String optionValue) {
        this.optionName = optionName;
        this.optionValue = optionValue;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public String getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue;
    }
}
