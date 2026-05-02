package UniversiteUygulamasi;

import java.util.ArrayList;

public class University {
    ArrayList<Person> kisiler = new ArrayList<>();

    public void addPerson(Person person){
        kisiler.add(person);
    }
    public void reportAllPersons(){
        for (Person person:kisiler){
            person.report();
            System.out.println();

        }
    }
}
