package CretionalPatterns.factorymethod.example4;

public class ManagerFactory implements Factory{
    @Override
    public Manager create() {
        Manager manager = new Manager(EmployeeRandomizer.createId(), EmployeeRandomizer.createName(),
                EmployeeRandomizer.createYear(), EmployeeRandomizer.createDepartment(), EmployeeRandomizer.createDepartment());
        return manager;
    }
}
