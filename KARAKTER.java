import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KARAKTER here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KARAKTER extends Actor
{
    /**
     * Act - do whatever the KARAKTER wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        getWorld().showText("score : "+SKOR.jumlah_skor,85,30);
        getWorld().showText("Nyawa : "+NYAWA.jumlah_nyawa,700,30);
        tombol();
        
        cek_level();
    }
    
    public void cek_level(){
        if(SKOR.jumlah_skor == 152 || SKOR.jumlah_skor > 152 ){
            Greenfoot.setWorld(new KEMENANGAN());
        }else if(SKOR.jumlah_skor == 101 || SKOR.jumlah_skor == 106){
            SKOR.jumlah_skor++;
            Greenfoot.setWorld(new KEBUN3());
        }else if(SKOR.jumlah_skor == 50){
            SKOR.jumlah_skor++;
            Greenfoot.setWorld(new KEBUN2());
        }
    }
    
    public void tombol()
    {
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()-2);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(),getY()+2);
        }
        if(Greenfoot.isKeyDown("left")){
            setImage("K_kanan.png");
            setLocation(getX()-2,getY());
        }
        if(Greenfoot.isKeyDown("right")){
            setImage("K_kiri.png");
            setLocation(getX()+2,getY());
        }
    }
}
