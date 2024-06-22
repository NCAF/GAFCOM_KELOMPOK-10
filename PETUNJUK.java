import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PETUNJUK here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PETUNJUK extends World
{

    /**
     * Constructor for objects of class PETUNJUK.
     * 
     */
    public GreenfootSound petunjuk = new GreenfootSound
        ("PAMAN DATANG (music by NurCahyani).mp3");

    public PETUNJUK()
    {    

        super(780, 480, 1); 
        addObject(new cmdBack(),100,360);
        addObject(new cmdNext(),680,360);
        

        
    }

    
}
