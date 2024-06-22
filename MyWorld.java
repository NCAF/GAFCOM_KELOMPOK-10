import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public GreenfootSound music = new GreenfootSound
    ("PAMAN DATANG (music by NurCahyani).mp3");
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
   
    public MyWorld()
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
        PLAY pLAY = new PLAY();
        addObject(pLAY,409,410);
        APEL aPEL = new APEL();
        addObject(aPEL,339,39);
        removeObject(aPEL);
        pLAY.setLocation(443,404);
        pLAY.setLocation(368,402);
        removeObject(pLAY);
        PLAY pLAY2 = new PLAY();
        addObject(pLAY2,400,407);

        HOWTOPLAY hOWTOPLAY = new HOWTOPLAY();
        addObject(hOWTOPLAY,690,35);
    }
}
