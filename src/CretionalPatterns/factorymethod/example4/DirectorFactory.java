package CretionalPatterns.factorymethod.example4;

public class DirectorFactory implements Factory{
    @Override
    public Director create() {
        Director director = new Director(EmployeeRandomizer.createId(), EmployeeRandomizer.createName(),
                EmployeeRandomizer.createYear(), "Management", "Management", 5000);
        return director;
    }
}
