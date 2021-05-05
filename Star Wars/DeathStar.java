import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DeathStar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeathStar extends World
{
    public static int score=0;

   
    /**
     * Constructor for objects of class DeathStar.
     * 
     */
    public DeathStar()
    {    

        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
        prepare();
        score=0;

    }

    
    public void act()
    {
        showText("Score: "+score,50,25);
        if(getObjects(Stormtrooper.class).size()==0)
        {
            Greenfoot.setWorld(new BeforeLevel2());
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    
    private void prepare()

    {

        MilleniumFalcon milleniumFalcon = new MilleniumFalcon();
        addObject(milleniumFalcon,50,191);

        Stormtrooper stormtrooper = new Stormtrooper();
        addObject(stormtrooper,771,23);
        Stormtrooper stormtrooper2 = new Stormtrooper();
        addObject(stormtrooper2,773,370);
        Stormtrooper stormtrooper3 = new Stormtrooper();
        addObject(stormtrooper3,713,61);
        Stormtrooper stormtrooper4 = new Stormtrooper();
        addObject(stormtrooper4,717,334);
        Stormtrooper stormtrooper5 = new Stormtrooper();
        addObject(stormtrooper5,648,101);
        Stormtrooper stormtrooper6 = new Stormtrooper();
        addObject(stormtrooper6,651,297);
        Stormtrooper stormtrooper7 = new Stormtrooper();
        addObject(stormtrooper7,581,139);
        Stormtrooper stormtrooper8 = new Stormtrooper();
        addObject(stormtrooper8,594,263);
        Stormtrooper stormtrooper9 = new Stormtrooper();
        addObject(stormtrooper9,514,171);
        Stormtrooper stormtrooper10 = new Stormtrooper();
        addObject(stormtrooper10,528,233);
        Stormtrooper stormtrooper11 = new Stormtrooper();
        addObject(stormtrooper11,452,204);
        Stormtrooper stormtrooper12 = new Stormtrooper();
        addObject(stormtrooper12,774,89);
        Stormtrooper stormtrooper13 = new Stormtrooper();
        addObject(stormtrooper13,774,151);
        Stormtrooper stormtrooper14 = new Stormtrooper();
        addObject(stormtrooper14,778,215);
        Stormtrooper stormtrooper15 = new Stormtrooper();
        addObject(stormtrooper15,776,286);
    }

    public void gameOver()
    {

        addObject(new ScoreBoard(score),getWidth()/2,getHeight()/2);
        addObject(new Button1(),398,370);
    }

}
