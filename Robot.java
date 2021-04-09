import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    private GreenfootImage robotimage1= new GreenfootImage("man01.png");
    private GreenfootImage robotimage2= new GreenfootImage("man02.png");
    int Hp = 10;
    int Points = 0;
 public void act() 
 {
        if( Greenfoot.isKeyDown("up") )
        {
            setLocation( getX(), getY() - 5);
        }
        if( Greenfoot.isKeyDown("left") )
        {
            setLocation( getX() - 5, getY() );
        }
        if( Greenfoot.isKeyDown("down") )
        {
            setLocation( getX(), getY() + 5 );
        }
        if( Greenfoot.isKeyDown("right") )
        {
            setLocation( getX() + 5, getY() );
        }
        if (isTouching(Block.class) )
        {
            setLocation(700,560);
            loseHp();
        }
        if (isTouching(Wall.class) )
        {
            setLocation(700,560);
        }
        if (isTouching(Pizza.class) )
        {
            removeTouching(Pizza.class);
            addPoints();
        }
        if (isTouching(Home.class) )
        {
            setLocation(700,560);
            Greenfoot.stop();
        }
 }
 public void checkKeyPress()
 {
        if( Greenfoot.isKeyDown("w") )
        {
            setLocation( getX(), getY() - 5);
        }
        if( Greenfoot.isKeyDown("a") )
        {
            setLocation( getX(), getY() + 5);
        }
        if( Greenfoot.isKeyDown("s") )
        {
            setLocation( getX() - 5 , getY() );
        }
        if( Greenfoot.isKeyDown("d") )
        {
            setLocation( getX() + 5, getY() );
        }
 }
 public void showStatus()
 {
    getWorld().showText("HP"+Hp,50,30);
    getWorld().showText("Points"+Points,50,10);
 }
 public void addPoints()
 {
    Points = Points + 1;
 }
 public void loseHp()
 {
    Hp = Hp - 1;
 }
 public void eatPizza()
 {
      if (isTouching(Pizza.class) )
      {
         Greenfoot.playSound("eat.wav");
         removeTouching(Pizza.class);
         addPoints();
      }
 }
 public void detectBlockCollision()
 {
      if (isTouching(Block.class) )
      {
        Greenfoot.playSound("hurt.wav");
        setLocation(700,560);
        loseHp();
      }
 }
 public void detectWallCollision()
 {
      if (isTouching(Wall.class) )
      {
          Greenfoot.playSound("hurt.wav");
          setLocation(700,560);
      }
 }
 public void hitHouse()
 {
      if (isTouching(Home.class) )
      {
        setLocation(700,560);
        Greenfoot.stop();
      }
 }
}