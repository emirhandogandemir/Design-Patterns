package CretionalPatterns.factorypattern.example5;

public class SchoolFactory {

    public School getSchoolType(String type){

        if(type.equals("NORMALSCHOOL")) return new NormalSchool();
        else if (type.equals("PRIVATESCHOOL")) return new PrivateSchool();
        else throw new RuntimeException("Gerekli okul bulunamadı");
    }
}
