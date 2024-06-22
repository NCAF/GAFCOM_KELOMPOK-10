import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NYAWA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NYAWA extends World
{

    /**
     * Constructor for objects of class NYAWA.
     * 
     */
    static int jumlah_nyawa = 5;
    public NYAWA()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(780, 480, 1); 
    }
    
    public static void nyawa_berkurang()
    {
        jumlah_nyawa--;
        if(jumlah_nyawa <= 0){
            Greenfoot.setWorld(new GAMEOVER());
        }
    }
}
