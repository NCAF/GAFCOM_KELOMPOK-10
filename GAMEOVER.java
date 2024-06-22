import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GAMEOVER here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GAMEOVER extends World
{

    /**
     * Constructor for objects of class GAMEOVER.
     * 
     */
    public GAMEOVER()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(780, 480, 1); 
        addObject(new TRYAGAIN(),200,420);
        addObject(new HOME(),560,430);
    }
}
