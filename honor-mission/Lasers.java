import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Laser do museu: causa dano ao jogador que encostar nele.
 * 
 * @author Gabriel Pedrozo && Mateus Cunha
 * @version 15/11/2026
 */
public class Lasers extends Actor
{
    /**
     * Cria um laser com o tamanho informado
     */
    public Lasers (int largura, int altura)
    {
        GreenfootImage imagem = new GreenfootImage(largura, altura);
        setImage(imagem);
    }
    
    /**
     * Se o jogador estiver encostando no laser, ele perde uma vida.
     */
    public void act()
    {
        if (isTouching(Jogador.class))
        {
            Vidas.perder();
        }
    }
}
