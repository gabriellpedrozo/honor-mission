import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Cartao eh um item consumivel que desbloqueia a passagem para a terceira fase.
 * 
 * @author Mateus Cunha
 * @version 17/11/2026
 */
public class Cartao extends ItemUtilizavel
{
    /** Nome usado para identificar o cartao no inventário. */
    public static final String NOME = "Cartao"; 
    /**
     * Cria o cartao.
     */
    public Cartao()
    {
        super(NOME, "Desbloqueia uma passagem no quartel.", true);
        setImage("chave.png");
    }
    
    /**
     * Ao usar o cartao, se tiver o jogador estiver no quartel e a porta
     * estiver bloqueada, ocorre o desbloqueio e retorna true.
     */
    @Override
    protected boolean usar(Jogador jogador) {
        return true;
    }
}
