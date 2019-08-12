package com.sqh.blogdemom.util;

import com.sqh.blogdemom.model.domain.User;

public class Misc {

    public static String buildURL(String url) {
        if (url.endsWith("/")) {
            url = url.substring(0, url.length() - 1);
        }
        if (!url.startsWith("http")) {
            url = "http://".concat(url);
        }
        return url;
    }

    public static User getLoginUser() {
        return new User();// TODO
    }
}
