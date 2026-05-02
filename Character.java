package TwoDGameCharacter;

import java.util.HexFormat;

public abstract class Character implements CanMove, Cloneable{

    String name;
    int health;
    Pozition pozition;
    Character target;

    public Character(String name , int startHealth){
        this.name=name;
        this.health=startHealth;
        this.pozition= new Pozition(0,0);
    }
    public abstract void soundOfDeath();

    public void reduceHealth(int damage){
        health = health - damage;
        if (health<0){
            health=0;
            soundOfDeath();
        }

        else {
            System.out.println(name + " has " + health + " health remaining.");
        }


    }

    public void Move(int newX,int newY){
        this.pozition.x=newX;
        this.pozition.y=newY;

    }

    @Override
    public String toString() {

        return "Character: " + name + " [Health: " + health + ", Pozition: " + pozition + "]";
    }
}
