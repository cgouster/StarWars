import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MilleniumFalcon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MilleniumFalcon extends Actor
{
    /**
     * Act - do whatever the MilleniumFalcon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //World w;
    public void act() 
    {
        //w=getWorld();
        moveUpAndDown();
        shoot();
    }    

    public void moveUpAndDown() {
        int y= getY();
        int x= getX();
        if(Greenfoot.isKeyDown("DOWN")) y=y+2;
        if(Greenfoot.isKeyDown("UP"))y=y-2;
        setLocation(x,y);
    }

    public void shoot()
    {
        World w=getWorld();
        if(Greenfoot.isKeyDown("space")){
            Greenfoot.playSound("Laser Blasts-SoundBible.com-108608437.wav");
            w.addObject(new LightSaber(), getX()+80, getY());
        }
    }

}
