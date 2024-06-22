import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KEMENANGAN here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KEMENANGAN extends World
{

    /**
     * Constructor for objects of class KEMENANGAN.
     * 
     */
    public GreenfootSound gembira = new GreenfootSound
    ("LAGU GEMBIRA(music by adel).wav");
    public KEMENANGAN()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(780, 480, 1); 
        addObject(new TRYAGAIN(),200,420);
        addObject(new HOME(),560,430);
        gembira.setVolume(80);
        gembira.play();
    }
}
