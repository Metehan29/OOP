package UniversiteUygulamasi;

public class Academician extends Person{
    private String department;
    public Academician(String name, int ID,String department) {
        super(name, ID);
        this.department=department;
    }

    @Override
    public String getDetails() {
        return "Department : " + department ;
    }
}
