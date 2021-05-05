import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stormtrooper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stormtrooper extends Actor
{
    /**
     * Act - do whatever the Stormtrooper wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int health=1;
    DeathStar thisGame;
    
    public void act() 
    {   World w=getWorld();

     
        move(-3);
        if (isAtEdge())
        {
            setLocation(590,getY());
        }
        else
        if(isTouching(MilleniumFalcon.class))
        {

            removeTouching(MilleniumFalcon.class);

            Greenfoot.setWorld(new GameoverScreen());

            //Greenfoot.playSound("imptheme.wav");

        }
        Shot();

       
    }

    public void Shot()
    {
        Actor ls = getOneObjectAtOffset(0, 0, LightSaber.class);
        if (ls != null)
        {
            getWorld().removeObject(ls);
            health--;
            if (health == 0) 
            {getWorld().removeObject(this);
                thisGame.score++;}
        }

    }
   
}
