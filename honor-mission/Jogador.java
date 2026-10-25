import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Representa o player: soldado que vai cumprir a missao no TG.
 * 
 * @author (Mateus Cunha) 
 * @version (22/10/2026)
 */
public class Jogador extends Actor
{

    /**
     * Act - do whatever the Jogador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimentar();
    }

    /**
     * Faz o jogador se movimentar pelo mapa
     */
    private void movimentar() {
        if (Greenfoot.isKeyDown("left"))
        {
            setRotation(0);
            moverComColisao(-4, 0);
        }

        if (Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
            moverComColisao(4, 0);
        }

        if (Greenfoot.isKeyDown("up"))
        {
            setRotation(270);
            moverComColisao(0, -4);
        }

        if (Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
            moverComColisao(0, 4);
        }
    }

     private void moverComColisao(int dx, int dy)
    {
        setLocation(getX() + dx, getY() + dy);

        if (isTouching(Obstaculo.class))
        {
            setLocation(getX() - dx, getY() - dy);
        }
    }
}

