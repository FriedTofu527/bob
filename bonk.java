import greenfoot.*;

public class bonk extends Actor
{
    private int speed;
    
    public bonk()
    {
        this.speed = 10;
    }
    
    public bonk(int s)
    {
        this.speed = s;
    }
    
    public void act() 
    {
        move(this.speed);
        getWorld().showText("hello", this.getX(), 10);
    }    
}
