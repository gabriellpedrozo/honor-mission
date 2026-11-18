import greenfoot.*;

/**
 * Tela exibida quando o jogador vence a missão.
 *
 * @author Mateus Cunha
 * @version 18/11/2026
 */
public class TelaVitoria extends World
{
    public TelaVitoria()
    {
        super(1000, 750, 1);
        prepare();
    }

    private void prepare()
    {
        addObject(new BotaoVoltar(), 650, 650);
    }
}