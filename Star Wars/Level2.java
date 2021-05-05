import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    DeathStar thisGame;
    /**
     * Constructor for objects of class Level2.
     * 
     */

    public Level2()
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
        Stormtrooper stormtrooper = new Stormtrooper();
        addObject(stormtrooper,448,54);
        Stormtrooper stormtrooper2 = new Stormtrooper();
        addObject(stormtrooper2,448,202);
        Stormtrooper stormtrooper3 = new Stormtrooper();
        addObject(stormtrooper3,455,353);
        Stormtrooper stormtrooper4 = new Stormtrooper();
        addObject(stormtrooper4,461,520);
        Stormtrooper stormtrooper5 = new Stormtrooper();
        addObject(stormtrooper5,520,123);
        Stormtrooper stormtrooper6 = new Stormtrooper();
        addObject(stormtrooper6,535,276);
        Stormtrooper stormtrooper7 = new Stormtrooper();
        addObject(stormtrooper7,533,443);
        Stormtrooper stormtrooper8 = new Stormtrooper();
        addObject(stormtrooper8,549,573);
        Stormtrooper stormtrooper9 = new Stormtrooper();
        addObject(stormtrooper9,548,23);
        Stormtrooper stormtrooper10 = new Stormtrooper();
        addObject(stormtrooper10,620,127);
        Stormtrooper stormtrooper11 = new Stormtrooper();
        addObject(stormtrooper11,630,346);
        Stormtrooper stormtrooper12 = new Stormtrooper();
        addObject(stormtrooper12,632,505);
        Stormtrooper stormtrooper13 = new Stormtrooper();
        addObject(stormtrooper13,381,284);
        Stormtrooper stormtrooper14 = new Stormtrooper();
        addObject(stormtrooper14,382,430);
        Stormtrooper stormtrooper15 = new Stormtrooper();
        addObject(stormtrooper15,369,126);
        DarthVader darthVader = new DarthVader();
        addObject(darthVader,740,311);
        MilleniumFalcon milleniumFalcon = new MilleniumFalcon();
        addObject(milleniumFalcon,51,285);
    }

    public void gameOver()
    {

        addObject(new ScoreBoard(thisGame.score),getWidth()/2,getHeight()/2);
        addObject(new Button1(),398,370);

    }

    public void act()
    {
        showText("Score: "+thisGame.score,50,25);
        if(getObjects(Stormtrooper.class).size()==0 && getObjects(DarthVader.class).size()==0 )
        {
            Greenfoot.setWorld(new WinScreen());
        }
    }

}
