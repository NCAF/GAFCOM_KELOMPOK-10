import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BOM here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BOM extends Actor
{
    /**
     * Act - do whatever the BOM wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY()+8);
        jatuh();
    }
    
    public void jatuh()
    {
        Actor KARAKTER = getOneIntersectingObject(KARAKTER.class);
        if(KARAKTER != null){
            getWorld().removeObject(this);
            NYAWA.nyawa_berkurang();
            
        }else if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
