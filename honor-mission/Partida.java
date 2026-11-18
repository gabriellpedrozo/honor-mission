import greenfoot.*;

/**
 * Controla o andamento da partida: passagem do tempo de invulnerabilidade
 * e verificação de fim de jogo. Os membros são estáticos para que possam
 * ser chamados por qualquer mundo.
 *
 * @author Mateus Cunha
 * @version 18/11/2026
 */
public class Partida
{
    /**
     * Classe utilitária: não deve ser instanciada.
     */
    private Partida() { }
    
    /**
     * Inicia a partida com pontuacao, vida e lasers do zero.
     */
    public static void iniciar()
    {
        Vidas.reiniciar();
        Pontuacao.reiniciar();
        Museu.reiniciarLasers();
        MusicaFundo.tocar();
        Greenfoot.setWorld(new Patio());
    }
    
    /**
     * Deve ser chamado uma vez por act pelo mundo ativo.
     * Faz passar o tempo de invulnerabilidade e encerra a partida
     * se o jogador ficou sem vidas.
     */
    public static void atualizar()
    {
        Vidas.passarTempo();

        if (Vidas.acabaram())
        {
            encerrarPorDerrota();
        }
    }

    /**
     * Para a música, toca o som de game over e volta para a tela inicial.
     */
    private static void encerrarPorDerrota()
    {
        MusicaFundo.parar();
        Greenfoot.playSound("game_over.wav");
        Greenfoot.setWorld(new TelaInicial());
    }
}