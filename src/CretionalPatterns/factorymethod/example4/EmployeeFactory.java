package CretionalPatterns.factorymethod.example4;

public class EmployeeFactory implements Factory{
    @Override
    public Employee create() {
        Employee employee = new Employee(EmployeeRandomizer.createId(), EmployeeRandomizer.createName(),
                EmployeeRandomizer.createYear(), EmployeeRandomizer.createDepartment());
        return employee;
    }
}
