package com.jenson.data.patternsduty.gof.proxy.virtual;

public class SecretFileHolder {
    public static String decodeFileName(String name) {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return name;
    }
}
