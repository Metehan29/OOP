package TwoDGameCharacter;

public class GameMain {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Garen",2000,100);
        Wizard wizard = new Wizard("Brand",800,50);

        System.out.println(wizard);
        System.out.println(warrior);

        wizard.Attack(warrior);

        wizard.Move(13,9);

        warrior.Attack(wizard);



        warrior.Move(27,89);

        wizard.Attack(warrior);

        System.out.println(wizard);
        System.out.println(warrior);




    }
}
