package TwoDGameCharacter;

public class Pozition implements Cloneable{
    int x,y;

    public Pozition(int x , int y){
        this.x=x;
        this.y=y;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
