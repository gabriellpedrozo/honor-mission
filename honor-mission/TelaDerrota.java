
import greenfoot.*;

/**
 * Tela exibida quando o jogador perde a missão.
 *
 * @author Gabriel Pedrozo
 * @version 19/11/2026
 */
public class TelaDerrota extends TelaResultado
{
    /**
     * Cria a tela de derrota e adiciona seus botões.
     */
    public TelaDerrota()
    {
        super("tela_derrota.png", 340, 405, 640, 405);
        prepare();
    }

    /**
     * Adiciona os botões de reiniciar e voltar ao menu.
     */
    private void prepare()
    {
        BotaoReiniciar botaoReiniciar = new BotaoReiniciar("reiniciar_derrota.png");
        addObject(botaoReiniciar, 354, 626);

        BotaoVoltar botaoVoltar = new BotaoVoltar("sair_derrota.png");
        addObject(botaoVoltar, 663, 627);
    }
}

