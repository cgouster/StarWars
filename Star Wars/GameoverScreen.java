import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameoverScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameoverScreen extends World
{

    /**
     * Constructor for objects of class GameoverScreen.
     * 
     */
    DeathStar thisGame;
    public GameoverScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        gameOver();
        prepare();
    }

    public void gameOver()
    {

        addObject(new ScoreBoard(thisGame.score),getWidth()/2,getHeight()/2);
        addObject(new Button1(),300,370);

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Greenfoot.playSound("imptheme.wav");
    }
}
