import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KEBUN here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KEBUN extends World
{

    /**
     * Constructor for objects of class KEBUN.
     * 
     */
    public void act(){
        if(Greenfoot.getRandomNumber(600)<2){
            addObject(new APEL(),Greenfoot.getRandomNumber(600)+0,5);
        }
        if(Greenfoot.getRandomNumber(500)<1){
            addObject(new ANGGUR(),Greenfoot.getRandomNumber(500)+0,6);
        }
        if(Greenfoot.getRandomNumber(500)<2){
            addObject(new MANGGA(),Greenfoot.getRandomNumber(500)+0,7);
        }
        if(Greenfoot.getRandomNumber(600)<2){
            addObject(new JERUK(),Greenfoot.getRandomNumber(600)+0,8);
        }
    }
    public KEBUN()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(780, 480, 1); 
        prepare();
    }
    private void prepare()
    {
        showText("LEVEL 1",400,40);
        KARAKTER KARAKTER = new KARAKTER();
        addObject(KARAKTER,550,300);
    }
}