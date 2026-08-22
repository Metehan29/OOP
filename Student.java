package UniversiteUygulamasi;

public class Student extends Person{
    private String major;
    public Student(String name, int ID,String major) {
        super(namee,ID);
        this.major=major;
        2
    }

    @Override
    public String getDetails() {
        return "Major : " + major;
    }
}
