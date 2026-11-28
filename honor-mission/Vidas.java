import greenfoot.*;

/**
 * Controla as vidas do jogador e o tempo de invulnerabilidade após levar dano.
 * Os membros são estáticos para que o estado continue o mesmo
 * quando o jogador troca de mundo.
 *
 * @author Mateus Cunha
 * @version 17/11/2026
 */
public class Vidas
{
    private static final int INICIAIS = 3;
    private static final int TEMPO_INVULNERAVEL = 30; // ~0.5s
    
    private static int quantidade = INICIAIS;
    private static int invulneravel = 0; // acts restantes sem poder levar dano
    
    /**
     * Classe utilitária: não deve ser instanciada.
     */
    private Vidas() { }
    
    /**
     * @return quantidade atual de vidas.
     */
    public static int getQuantidade()
    {
        return quantidade;
    }
    
    /**
     * @return true se o jogador ficou sem vidas.
     */
    public static boolean acabaram()
    {
        return quantidade <= 0;
    }
    
    /**
     * Tira uma vida, se ainda houver e o jogador não estiver invulnerável.
     * Após levar dano, fica invulnerável por alguns acts.
     */
    public static void perder()
    {
        if (quantidade > 0 && invulneravel == 0)
        {
            quantidade--;
            invulneravel = TEMPO_INVULNERAVEL;
            Greenfoot.playSound("dano.wav");
        }
    }
    
    /**
     * Faz passar um act do tempo de invulnerabilidade.
     * Deve ser chamado uma vez por act.
     */
    public static void passarTempo()
    {
        if (invulneravel > 0)
        {
            invulneravel--;
        }
    }
    
    /**
     * Devolve as vidas iniciais e zera a invulnerabilidade (nova partida).
     */
    public static void reiniciar()
    {
        quantidade = INICIAIS;
        invulneravel = 0;
    }
}