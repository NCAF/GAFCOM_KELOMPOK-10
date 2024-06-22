import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cmdBack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cmdBack extends Actor
{
    /**
     * Act - do whatever the cmdBack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        GreenfootImage image = new GreenfootImage("BACK.png");
        setImage(image);
        
        if(Greenfoot.mousePressed(this)){
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
