package TwoDGameCharacter;

public class Wizard extends Character {

      public int mana ;
      int damage = 100;
    public Wizard(String name, int startHealth,int mana) {
        super(name, startHealth);
        this.mana=mana;
    }

    @Override
    public void soundOfDeath() {
        System.out.println( name + "It quietly vanished...");
    }


    @Override
    public void Attack(Character target) {

        if(mana >= 10){
            System.out.println(name + " cast a fireball at " + target.name + " and dealt " + damage + " damage!");
            target.reduceHealth(damage);
            mana-=10;

        }
        else {
            System.out.println("Insufficient mana; attack cannot be performed");

        }
    }

    @Override
    public void reduceHealth(int damage) {

        super.reduceHealth(damage);



    }



}
