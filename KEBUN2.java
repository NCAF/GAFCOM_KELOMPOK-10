import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KEBUN2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KEBUN2 extends World
{

    /**
     * Constructor for objects of class KEBUN2.
     * 
     */
    public void act(){
        if(Greenfoot.getRandomNumber(600)<4){
            addObject(new APEL(),Greenfoot.getRandomNumber(800)+0,450);
        }
        if(Greenfoot.getRandomNumber(500)<4){
            addObject(new ANGGUR(),Greenfoot.getRandomNumber(500)+0,350);
        }
        if(Greenfoot.getRandomNumber(400)<2){
            addObject(new MANGGA(),Greenfoot.getRandomNumber(800)+0,300);
        }
        if(Greenfoot.getRandomNumber(700)<2){
            addObject(new JERUK(),Greenfoot.getRandomNumber(800)+0,10);
        }
        if(Greenfoot.getRandomNumber(750)<1){
            addObject(new BOM(),Greenfoot.getRandomNumber(800)+0,10);
        }
    }
    public KEBUN2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(780, 480, 1); 
        prepare();
        
    }
    private void prepare()
    {
        showText("LEVEL 2",400,40);
        KARAKTER KARAKTER = new KARAKTER();
        addObject(KARAKTER,550,300);
    }
}
