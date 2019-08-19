package com.jenson.data.patternsduty.gof.proxy.protection;

public class GeneralEmployee implements Employee {
    private String name;
    private Grade grade;

    public GeneralEmployee(String name, Grade grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Grade getGrade() {
        return this.grade;
    }

    @Override
    public String getDesc(Employee emp) {
        return String.format("Viewer[%s] - Display %s %s", emp.getName(), grade.name(), name);
    }
}
