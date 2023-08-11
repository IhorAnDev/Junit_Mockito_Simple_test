import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class EmployeeServiceWithoutMock {

    EmployeeService employeeService;
    EmployeeRepository employeeRepository;

    @BeforeEach
    void setUp() {
        employeeRepository = new EmployeeRepository();
        employeeService = new EmployeeService(employeeRepository);
    }

    @Test
    void getEmployeesTest() {
        List<EmployeeEntity> result = employeeService.getEmployees();
        Assertions.assertEquals(4, result.size());
    }

}
