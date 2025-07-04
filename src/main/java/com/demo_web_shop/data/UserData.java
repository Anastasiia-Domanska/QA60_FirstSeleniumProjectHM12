package com.demo_web_shop.data;

public class UserData {
    static int i = (int) ((System.currentTimeMillis()/1000)%3000);

    public static final String NAME = "Anastasiia";
    public static final String LAST_NAME = "Do";
    public static final String EMAIL = "anastasiia23" + i + "@gmail.com";
    public static final String PASSWORD = "Aa12345!";
    public static final String CONFIRM_PASSWORD = "Aa12345!";
    public static final String LOGIN = "anastasiia23@gmail.com";
}
