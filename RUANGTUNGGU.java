import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RUANGTUNGGU here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RUANGTUNGGU extends World
{

    /**
     * Constructor for objects of class RUANGTUNGGU.
     * 
     */
    
   
    public RUANGTUNGGU()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(780, 480, 1); 
        prepare();
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        NO nO = new NO();
        addObject(nO,295,306);
        YES yES = new YES();
        addObject(yES,435,307);
    }
}
