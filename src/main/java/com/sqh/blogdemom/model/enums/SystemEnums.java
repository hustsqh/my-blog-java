package com.sqh.blogdemom.model.enums;

public enum SystemEnums {
    ERROR(false, "系统错误"),
    OPERATION_SUCCESS(true, "操作成功"),
    OPERATION_ERROR(false, "操作失败"),
    PRESERVE_SUCCESS(true, "保存成功"),
    PRESERVE_ERROR(false, "保存失败");

    private boolean flag;
    private String message;

    SystemEnums(boolean flag, String message) {
        this.flag = flag;
        this.message = message;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
