import greenfoot.*;
import java.util.Random;

public class plane extends Actor
{
    public void act() 
    {
        move(10);
        
        if (isAtEdge())
        {
            turn((int)(Math.random() * 91 + 90));
        }
        
        removeTouching(plane.class);
    }    
}
