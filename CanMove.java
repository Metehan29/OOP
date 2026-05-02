package TwoDGameCharacter;

public interface CanMove {
    public abstract void Move(int newX,int newY);
    public abstract void Attack(Character target);
}
