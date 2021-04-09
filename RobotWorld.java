import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RobotWorld here.
 * 
 * @author Jeremy Crowell
 * @version (a version number or a date)
 */
public class RobotWorld extends World
{
    /**
     * Constructor for objects of class RobotWorld.
     * 
     */
    public RobotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject( new Robot(), 700, 70 );
        addObject( new Scorepanel(), 75, 555 );
        addObject( new Pizza(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
        addObject( new Pizza(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
        addObject( new Pizza(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
        addObject( new Pizza(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
        addObject( new Pizza(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
        addObject( new Block(), 400, 200 );
        addObject( new Wall(), 60, 200 );
        addObject( new Wall(), 740, 200 );
        addObject( new Wall(), 160, 200 );
        addObject( new Wall(), 640, 200 );
        addObject( new Wall(), 240, 200 );
        addObject( new Wall(), 560, 200 );
        addObject( new Home(), 700, 555 );
    }
}
