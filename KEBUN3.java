import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KEBUN3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KEBUN3 extends World
{

    /**
     * Constructor for objects of class KEBUN3.
     * 
     */
    public void act(){
        if(Greenfoot.getRandomNumber(60)<2){
            addObject(new APEL(),Greenfoot.getRandomNumber(500)+0,5);
        }
        if(Greenfoot.getRandomNumber(50)<1){
            addObject(new ANGGUR(),Greenfoot.getRandomNumber(500)+0,6);
        }
        if(Greenfoot.getRandomNumber(50)<2){
            addObject(new MANGGA(),Greenfoot.getRandomNumber(500)+0,7);
        }
        if(Greenfoot.getRandomNumber(60)<2){
            addObject(new JERUK(),Greenfoot.getRandomNumber(500)+0,8);
        }
        if(Greenfoot.getRandomNumber(400)<1){
            addObject(new BOM(),Greenfoot.getRandomNumber(400)+0,100);
        }
        if(Greenfoot.getRandomNumber(400)<1){
            addObject(new BOM(),Greenfoot.getRandomNumber(400)+0,200);
        }
        if(Greenfoot.getRandomNumber(400)<1){
            addObject(new BOM(),Greenfoot.getRandomNumber(400)+0,300);
        }
    }
    public KEBUN3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(780, 480, 1); 
        prepare();
    }
    
    private void prepare()
    {
        showText("LEVEL 3",400,40);
        KARAKTER KARAKTER = new KARAKTER();
        addObject(KARAKTER,550,300);
    }
}
