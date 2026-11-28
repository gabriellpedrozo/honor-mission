/**
 * Controla a pontuação do jogador.
 * Os membros são estáticos para que o valor continue o mesmo
 * quando o jogador troca de mundo.
 *
 * @author Mateus Cunha
 * @version 17/11/2026
 */
public class Pontuacao
{
    private static int total = 0;
    
     /**
     * Classe utilitária: não deve ser instanciada.
     */
    private Pontuacao() { }
    
    /**
     * @return pontuação atual.
     */
    public static int getTotal()
    {
        return total;
    }
    
    /**
     * Soma pontos à pontuação atual. Valores zero ou negativos são ignorados.
     *
     * @param pontos quantidade de pontos recebida.
     */
    public static void adicionar(int pontos)
    {
        if (pontos > 0)
        {
            total += pontos;
        }
    }
    
    /**
     * Zera a pontuação (nova partida).
     */
    public static void reiniciar()
    {
        total = 0;
    }
}