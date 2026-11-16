import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lasers here.
 * 
 * @author (Gabriel Pedrozo) 
 * @version (15/11/2026)
 */
public class Lasers extends Actor
{
    /**
     * Construtor dos Lasers
     */
    public Lasers (int largura, int altura)
    {
        GreenfootImage imagem = new GreenfootImage(largura, altura);
        imagem.setTransparency(100);
        imagem.setColor(Color.GREEN);
        imagem.fill();
        setImage(imagem);
    }
    
    /**
     * Act - do whatever the Lasers wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
