package TwoDGameCharacter;

public class Warrior extends Character{

        int armor ;
        int damage = 20;
    public Warrior(String name , int healt,int armor){
        super(name,healt);
        this.armor=armor;
    }

    public void soundOfDeath(){
        System.out.println(name + " Said : Long live the homeland...");
            System.out.println("And dont forget me!");
    }



    public void Attack(Character target){

        System.out.println(name + " dealt " + damage + " damage to " + target.name + " with their sword.");
        target.reduceHealth(damage);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public void reduceHealth(int damage) {

        if (this.armor<damage){
            int realDamage = damage - this.armor;
            armor=0;
            super.reduceHealth(realDamage);

        }

        else {

            this.armor = this.armor - damage;
            System.out.println("Armor absorbed the damage, remaining armor : "+ this.armor);
        }





    }
}
