package com.jenson.data.patternsduty.gof.proxy.protection;

public interface Employee {
    String getName();
    Grade getGrade();
    String getDesc(Employee emp);
}
