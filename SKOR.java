import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SKOR here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SKOR extends World
{

    /**
     * Constructor for objects of class SKOR.
     * 
     */
    static int jumlah_skor = 0;
    public SKOR()
    {    
        super(780, 480, 1); 
    }
    public static void skor_berkurang()
    {
        jumlah_skor-=5;
        if(jumlah_skor < 0){
            Greenfoot.setWorld(new GAMEOVER());
        }
    }
}
