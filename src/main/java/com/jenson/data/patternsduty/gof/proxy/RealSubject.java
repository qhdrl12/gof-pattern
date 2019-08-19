package com.jenson.data.patternsduty.gof.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RealSubject implements Subject {
    private String fileName;

    public RealSubject() { }

    @Override
    public void action() {
        log.info("Displaying {}", fileName);
    }

    public void loadFromDisk(String fileName) {
        this.fileName = fileName;
        log.info("Loading {}", fileName);
    }
}
