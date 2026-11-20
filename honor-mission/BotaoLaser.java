import greenfoot.*;
import java.util.List;
/**
 * Representa o botão responsável por desativar os lasers do Museu.
 * O jogador precisa se aproximar e pressionar a tecla E para utilizá-lo.
 *
 * @author Gabriel Pedrozo
 * @version 15/11/2026
 */
public class BotaoLaser extends Actor
{
    private static final int ALCANCE = 60;
    private boolean ePressionado;
    private boolean utilizado = false;

    /**
     * Inicializa o botão e define o estado inicial da tecla E.
     */

    public BotaoLaser()
    {
        setImage("botao_laser.png");
        ePressionado = false;
    }


    /**
     * Verifica se o jogador está próximo e se a tecla E foi pressionada.
     * Ao utilizar o botão, solicita a desativação dos lasers do Museu.
     * O botão só pode ser utilizado uma vez.
     */
    public void act()
    {
        boolean eAgora = Greenfoot.isKeyDown("e");
        List<Jogador> perto = getObjectsInRange(ALCANCE, Jogador.class);

        if (eAgora && !perto.isEmpty() && !utilizado)
        {
            Greenfoot.playSound("desativa-laser.wav");
            Museu.desativarLasers();
            utilizado = true;
        }

        ePressionado = eAgora;
    }
}
