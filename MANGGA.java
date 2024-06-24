import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MANGGA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MANGGA extends Actor
{
    /**
     * Act - do whatever the MANGGA wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       move(2);
       turn(Greenfoot.getRandomNumber(5));
       turnAtEdge();
       buah();
    }
    
    public void turnAtEdge(){
        if(getX() <= 15 || getX() >= getWorld().getWidth()-15){
            turn(60);
        }
        if(getX() <= 15 || getX() >= getWorld().getWidth()-15){
            turn(60);
        }
    }
    
    public void buah(){
        Actor KARAKTER = getOneIntersectingObject(KARAKTER.class);
        if(KARAKTER != null){
            getWorld().removeObject(this);
            SKOR.jumlah_skor+=5;
            Greenfoot.playSound("petikbuah.wav");
        }
    }
}
