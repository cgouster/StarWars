import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LightSaber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LightSaber extends Actor
{

    public void act() 
    {
        move();
        fire();

    }

    public void move()
    {
        move(5);
    }

    public void fire()
    {
        World w=getWorld();

        if(isAtEdge())
        {
            w.removeObject(this);
        }
    }}