package com.jenson.data.patternsduty;


import com.jenson.data.patternsduty.gof.proxy.protection.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;


@Slf4j
@DisplayName("😱")
public class ProxyTests {

    private final String defaultName = "Jenson";

    private Supplier<List<Employee>> generateEmployees = () -> {
        Employee ceo = new GeneralEmployee("Alex", Grade.VICEPRESIDENT);
        Employee cto = new GeneralEmployee("Hoya", Grade.VICEPRESIDENT);
        Employee productManager = new GeneralEmployee("Max", Grade.MANAGER);
        Employee jenson = new GeneralEmployee(defaultName, Grade.STAFF);
        Employee alvin = new GeneralEmployee("Alvin", Grade.STAFF);

        return Arrays.asList(ceo, cto, productManager, jenson, alvin);

    };

    private Function<List<Employee>, List<Employee>> generateProtectionEmployees =
            (employees) -> employees.stream().map(ProtectionEmployee::new).collect(Collectors.toList());

    private void printAllEmployeeInfo(Employee viewer, List<Employee> employees) {
        employees.stream()
                .map(employee -> {
                    try {
                        return employee.getDesc(viewer);
                    } catch (NotAuthorizedException e) {
                        return "Not authorized";
                    }
                }).forEach(System.out::println);
    }

    @Test
    @DisplayName("나의 정보를 볼수 있어야함")
    public void my_info_should_be_visible_to_me() {
        Employee jenson = new GeneralEmployee(defaultName, Grade.STAFF);
        Employee viewer = new GeneralEmployee(defaultName, Grade.STAFF);

        String desc = jenson.getDesc(viewer);
        String log = String.format("Viewer[%s] - Display STAFF %s", defaultName, defaultName);
        Assertions.assertEquals(log, desc);
    }

    @Test
    @DisplayName("권한 없는 사용자의 조회는 차단되어야함_실패")
    public void view_other_users_without_authority() {
        Employee jenson = new GeneralEmployee(defaultName, Grade.STAFF);
        Employee viewer = new GeneralEmployee("Will", Grade.STAFF);

        assertDoesNotThrow(() -> jenson.getDesc(viewer));
    }

    @Test
    @DisplayName("권한 없는 사용자의 조회는 차단되어야함_성공")
    public void view_other_users_without_authority_success() {
        Employee jenson = new GeneralEmployee(defaultName, Grade.STAFF);
        Employee protectionJenson = new ProtectionEmployee(jenson);
        Employee viewer = new GeneralEmployee("Will", Grade.STAFF);

        assertThrows(NotAuthorizedException.class, () -> protectionJenson.getDesc(viewer));
    }

    @Test
    @DisplayName("내가 전직원 정보를 조회?")
    public void i_want_to_look_up_information_all_employees() {
        Employee jenson = new GeneralEmployee(defaultName, Grade.STAFF);
        List<Employee> employees = generateEmployees.get();

        printAllEmployeeInfo(jenson, employees);
    }

    @Test
    @DisplayName("내가 보호되는 전직원 정보를 조회?")
    public void i_want_to_look_up_information_all_protect_employees() {
        Employee jenson = new GeneralEmployee(defaultName, Grade.STAFF);
        List<Employee> employees = generateProtectionEmployees.apply(generateEmployees.get());

        printAllEmployeeInfo(jenson, employees);
    }

    @Test
    @DisplayName("호야가 보호되는 전직원 정보를 조회?")
    public void hoya_want_to_look_up_information_all_proect_employees() {
        Employee hoya = new GeneralEmployee("Hoya", Grade.VICEPRESIDENT);
        List<Employee> employees = generateProtectionEmployees.apply(generateEmployees.get());

        printAllEmployeeInfo(hoya, employees);
    }
}
