package UniversiteUygulamasi;

public class UniversityMain {
    public static void main(String[]args){
        University universty = new University();
        Student student = new Student("Metehan",220313023,"Computer Engineer");
        Academician academician = new Academician("Mehmet",231035646,"Mathematics");

        universty.addPerson(student);
        universty.addPerson(academician);
        universty.reportAllPersons();
        System.out.println(academician.getDetails());
    }
}
