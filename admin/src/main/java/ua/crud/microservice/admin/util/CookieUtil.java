package ua.crud.microservice.admin.util;

import jakarta.servlet.http.Cookie;
import ua.simpleservletframework.mvc.servlet.DispatcherServlet;

import java.util.Arrays;
import java.util.Optional;

import static ua.simpleservletframework.core.util.PropertyUtil.getProperty;
import static ua.simpleservletframework.mvc.servlet.DispatcherServlet.request;

public class CookieUtil {
    public static Cookie getCurrentUserCookie() {
        return Arrays.stream(
                        Optional.ofNullable(request.getCookies())
                                .orElse(new Cookie[] {new Cookie("current_user", null)})
                )
                .filter(cookie -> cookie.getValue().equals(getProperty("current_user")))
                .findFirst()
                .orElse(new Cookie("current_user", null));
    }

    public static boolean isCurrentUserExists() {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            return Arrays.stream(cookies).anyMatch(cookie -> cookie.getValue().equals(getProperty("current_user")));
        } else {
            return false;
        }
    }
}