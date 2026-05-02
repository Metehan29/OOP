package UniversiteUygulamasi;

public class Student extends Person{
    private String major;
    public Student(String name, int ID,String major) {
        super(name,ID);
        this.major=major;
    }

    @Override
    public String getDetails() {
        return "Major : " + major;
    }
}
