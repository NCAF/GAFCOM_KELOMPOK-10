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
    public GreenfootSound music = new GreenfootSound
    ("LAGU GEMBIRA(music by adel).mp3");
    public void started()
    {
        music.setVolume(80);
        music.play();
    }
    
    public void stopped()
    {
      music.stop();
      music.pause();
    }
    public KEMENANGAN()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(780, 480, 1); 
        addObject(new cmdBack(),100,360);
        addObject(new cmdNext(),680,360);
    }
}
