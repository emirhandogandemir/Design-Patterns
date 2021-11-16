package CretionalPatterns.factorypattern.example5;

public class Client {
    public static void main(String[] args) {

        SchoolFactory schoolFactory = new SchoolFactory();
        School school = schoolFactory.getSchoolType("NORMALSCHOOL");
        school.closeTime();

    }
}
