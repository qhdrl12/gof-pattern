package com.jenson.data.patternsduty.gof.proxy;

public class Proxy implements Subject {

    private RealSubject realSubject;
    private String fileName;

    public Proxy() {
        this.realSubject = new RealSubject();
    }

    @Override
    public void action() {
        realSubject.action();
    }

    public void loadFromDisk(String fileName) {
        if (this.fileName.equals(fileName)) return;
        this.fileName = fileName;
        realSubject.loadFromDisk(fileName);
    }
}
