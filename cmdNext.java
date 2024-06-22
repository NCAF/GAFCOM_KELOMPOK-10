import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cmdNext here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cmdNext extends Actor
{
    /**
     * Act - do whatever the cmdNext wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         // Add your action code here.
        if(Greenfoot.mousePressed(this)){
        }
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new LARANGAN());
        }
    }
}
