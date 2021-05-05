import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BeforeLevel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BeforeLevel2 extends World
{

    /**
     * Constructor for objects of class BeforeLevel2.
     * 
     */
    public BeforeLevel2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        OtherLetters otherLetters = new OtherLetters();
        addObject(otherLetters,415,312);
    }

    public void act()
    {
        if (Greenfoot.isKeyDown("enter"))
            Greenfoot.setWorld(new Level2());}
}
