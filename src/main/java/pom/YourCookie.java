package pom;

import org.openqa.selenium.Cookie;

import java.util.Date;

public class YourCookie {
    String name;
    String value;
    String path;
    String domain;
    Date expiry;

    public YourCookie(Cookie cookie) {
        this.name = cookie.getName();
        this.value = cookie.getValue();
        this.path = cookie.getPath();
        this.domain = cookie.getDomain();
        this.expiry = cookie.getExpiry();
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return "eyJib29raW5nX2dsb2JhbCI6W3sibG9naW5faGludCI6InlMdVFOMmZ6czdUb0xkVzZ0RjFLeVpjWVZIRUNCc2U4WDZTaEhwT3lYTjgifV19";
    }

    public String getPath() {
        return path;
    }

    public String getDomain() {
        return domain;
    }

    public Date getExpiry() {
        return expiry;
    }
}
