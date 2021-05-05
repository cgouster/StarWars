import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DarthVader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DarthVader extends Actor
{
    /**
     * Act - do whatever the DarthVader wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int direction = 5;
    private int health=10;
    DeathStar thisGame;
    public void act() 
    {

        {
            setLocation(getX(), getY()+direction);
            if (isAtEdge()) direction *= -1;
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
            if (health == 0) {
                getWorld().removeObject(this);
                thisGame.score++;
            }
        }

    }}
