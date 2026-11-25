import greenfoot.*;

/**
 * Esse botao exibe os itens colecionaveis que o jogador pegou durante a partida.
 * 
 * @author Mateus Cunha && Gabriel Pedrozo 
 * @version 25/11/2026
 */
public class BotaoColecao extends Botao
{
    /**
     * Construtor para o botao colecao.
     */
    public BotaoColecao()
    {
        super("iniciar_missao.png"); //TROCAR
    }
    
    @Override
    public void aoClicar() {
        Greenfoot.setWorld(new TelaInstrucoes()); //TROCAR
    }
}
