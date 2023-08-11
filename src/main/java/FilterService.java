import java.util.List;
import java.util.stream.Collectors;

public class FilterService {

    private EmployeeService employeeService;

    public FilterService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public List<EmployeeEntity> getEmployeesDriver() {
        return employeeService.getEmployees()
                .stream().filter(e -> e.getPosition().equals("Driver")).collect(Collectors.toList());
    }
}
