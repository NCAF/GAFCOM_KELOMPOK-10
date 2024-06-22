import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LARANGAN here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LARANGAN extends World
{

    /**
     * Constructor for objects of class LARANGAN.
     * 
     */
   public GreenfootSound music = new GreenfootSound
    ("PAMAN DATANG (music by NurCahyani).mp3");
    public void started()
    {
        music.setVolume(75);
        music.play();
    }
    
    public void stopped()
    {
      music.stop();
      music.pause();
    }
    public LARANGAN()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(780, 480, 1); 
        addObject(new cmdBack(),100,360);
        addObject(new cmdNext(),680,360);

    }
    
    
}
