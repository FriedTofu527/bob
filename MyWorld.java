import greenfoot.*;

public class MyWorld extends World
{   
    public MyWorld()
    {    
        super(800, 600, 1);
         
        plane p1 = new plane();
        addObject(p1, 100, 100);
        for (int i = 0; i < 8; i ++)
        {
            for (int x = 0; x < 6; x ++)
            {
                addObject(new plane(), 50 + 100 * i, 50 + 100 * x);
            }
        }
        
        addObject(new bonk(1), 100, 100);
        addObject(new bonk(5), 200, 200);
    }
}
