package UniversiteUygulamasi;

public class Person {
    private String name ;
    private int ID;
    public Person(String name,int ID){
        this.name=name;
        this.ID=ID;

}

    public String getDetails() {
        return null;
    }

    public void report(){
        System.out.println("Name:" + name + "\nID:" + ID);
    }

}
