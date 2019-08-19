package com.jenson.data.patternsduty.gof.proxy.protection;

public class ProtectionEmployee implements Employee {
    private Employee employee;

    public ProtectionEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getName() {
        return this.employee.getName();
    }

    @Override
    public Grade getGrade() {
        return this.employee.getGrade();
    }

    @Override
    public String getDesc(Employee emp) {
        if (getGrade() == emp.getGrade() && getName() == emp.getName()) {
            return this.employee.getDesc(emp);
        }

        switch (emp.getGrade()) {
            case VICEPRESIDENT:
                if (getGrade() == Grade.MANAGER || getGrade() == Grade.STAFF) {
                    return this.employee.getDesc(emp);
                }
            case MANAGER:
                if (getGrade() == Grade.STAFF) {
                    return this.employee.getDesc(emp);
                }
            default:
                throw new NotAuthorizedException();
        }
    }
}
