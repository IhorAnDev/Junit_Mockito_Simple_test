import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class FilterServiceTest {

    @Mock
    private EmployeeService employeeService;

    @InjectMocks
    private FilterService filterService;

    @BeforeEach
    void setUp() {
        Mockito.when(employeeService.getEmployees()).thenReturn(createListEmployee());
    }

    @AfterEach
    public void tearDown() {
        reset(employeeService);
    }

    @Test
    public void filterServiceTestWithGetEmployeeDriver() {
        List<EmployeeEntity> result = filterService.getEmployeesDriver();
        verify(employeeService, times(1)).getEmployees();
        Assertions.assertEquals(2, result.size());
    }

    @Test
    public void getEmployeeWithExceptionTest() {
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            filterService.getEmployeesDriver().get(6);
        });
    }



    private List<EmployeeEntity> createListEmployee() {
        return List.of(new EmployeeEntity(1, "John Doe", "Manager"),
                new EmployeeEntity(2, "Jane Doe", "Driver"),
                new EmployeeEntity(3, "Jorge Doe", "Driver"),
                new EmployeeEntity(4, "Jack Doe", "Programmer"));
    }
}
