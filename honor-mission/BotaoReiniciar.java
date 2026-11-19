import greenfoot.*;
/**
 * Botão que reinicia a partida.
 *
 * @author Gabriel Pedrozo
 * @version 19/11/2026
 */
public class BotaoReiniciar extends Botao
{
    /**
     * Cria o botão de reiniciar.
     */
    public BotaoReiniciar(String imagem)
    {
        super(imagem);
    }

    /**
     * Ao clicar, inicia uma nova partida.
     */
    @Override
    public void aoClicar()
    {
        Partida.iniciar();
    }
}
