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
            addObject(new ANGGUR(),Greenfoot.getRandomNumber(600)+0,250);
        }
        if(Greenfoot.getRandomNumber(500)<1){
            addObject(new MANGGA(),Greenfoot.getRandomNumber(600)+0,450);
        }
        if(Greenfoot.getRandomNumber(700)<2){
            addObject(new JERUK(),Greenfoot.getRandomNumber(600)+0,10);
        }
        if(Greenfoot.getRandomNumber(400)<1){
            addObject(new BOM(),Greenfoot.getRandomNumber(600)+0,10);
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
