import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Intro extends World
{
    private static GreenfootSound sound = new GreenfootSound("starwars.mp3");
    /**
     * Constructor for objects of class Intro.
     * 
     */
    public Intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        TitleLetters titleLetters = new TitleLetters();
        addObject(titleLetters,404,296);
    }

    public void act()
    {
        if (Greenfoot.isKeyDown("enter"))
            Greenfoot.setWorld(new DeathStar());
        if (Greenfoot.isKeyDown("i"))
            Greenfoot.setWorld(new Instructions());
        sound.play();
        
    }
}
