import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vigia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vigia extends Actor
{   
    boolean patrulhandoOeste;
    
    /**
     * Act - do whatever the Vigia wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        patrulhar();
    }
    
    /**
     * Vigia se movimenta pela rota de patrulha
     */
    private void patrulhar() {
        if (this.getX() <= 564) {
            patrulhandoOeste = false;
        } else if (this.getX() >= 864) {
            patrulhandoOeste = true;
        }
        if (patrulhandoOeste) {
            move(-3);
        } else {
            move(3);
        }
    }
}
