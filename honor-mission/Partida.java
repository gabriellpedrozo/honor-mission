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
    private static Musica musicaFundo = new Musica("avante_camaradas.wav");
    private static Musica musicaVitoria = new Musica("batista_de_melo.mp3");
    
    /**
     * Classe utilitária: não deve ser instanciada.
     */
    private Partida() { }
    
    /**
     * Inicia a partida com pontuacao, vida e lasers do zero.
     */
    public static void iniciar()
    {
        musicaVitoria.parar();
        Vidas.reiniciar();
        Pontuacao.reiniciar();
        Museu.reiniciarLasers();
        musicaFundo.tocar();
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
        Greenfoot.playSound("game_over.wav");
        voltarAoMenu();
    }
    
    /**
     * Encerra a partida com vitória: para a música de fundo, toca a música
     * de vitória e vai para a tela de vitória.
     */
    public static void vencer()
    {
        musicaFundo.parar();
        musicaVitoria.tocar();
        Greenfoot.setWorld(new TelaVitoria());
    }
    
    /**
     * Volta para a tela inicial, parando qualquer música que esteja tocando.
     */
    public static void voltarAoMenu()
    {
        musicaVitoria.parar();
        musicaFundo.parar();
        Greenfoot.setWorld(new TelaInicial());
    }
}