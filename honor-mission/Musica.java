import greenfoot.*;

/**
 * Controla a musica de fundo do jogo.
 * O som fica em um campo static para continuar tocando
 * quando o jogador troca de mundo (Patio <-> CasaVigia).
 * 
 * @author (Mateus Cunha) 
 * @version (11/09/2026)
 */
public class Musica 
{
    private static final int VOLUME = 50;
    private GreenfootSound som;
    
    /**
     * Recebe o nome do arquivo e cria uma musica para ser tocada
     */
    public Musica (String arquivo) {
        som = new GreenfootSound(arquivo);
    }

    /**
     * Toca a musica em loop. Se ja estiver tocando, nao faz nada,
     * entao chamar de novo nao reinicia a musica.
     */
    public void tocar()
    {
        if (!som.isPlaying()) {
            som.setVolume(VOLUME);
            som.playLoop();
        }
    }

    /**
     * Para a musica.
     */
    public void parar()
    {
        som.stop();
    }
}