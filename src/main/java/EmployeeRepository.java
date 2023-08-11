import java.util.List;

public class EmployeeRepository {

    public List<EmployeeEntity> getAllEmployees() {
        return List.of(new EmployeeEntity(1, "John Doe", "Manager"),
                new EmployeeEntity(2, "Jane Doe", "Driver"),
                new EmployeeEntity(3, "Jorge Doe", "Driver"),
                new EmployeeEntity(4, "Jack Doe", "Programmer"));
    }
}
