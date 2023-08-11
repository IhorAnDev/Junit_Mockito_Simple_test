public class EmployeeEntity {

    private int id;
    private String name;
    private String position;

    public EmployeeEntity(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

}
