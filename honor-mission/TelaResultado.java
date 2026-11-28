
import greenfoot.*;

/**
 * Classe base das telas de resultado da partida.
 * Reúne funcionalidades compartilhadas pelas telas de vitória e derrota.
 *
 * @author Gabriel Pedrozo
 * @version 19/11/2026
 */
public abstract class TelaResultado extends World
{
    /**
     * Cria uma tela de resultado e exibe a pontuação e o tempo.
     *
     * @param imagem imagem de fundo da tela.
     * @param xPontuacao posição horizontal da pontuação.
     * @param yPontuacao posição vertical da pontuação.
     * @param xTempo posição horizontal do tempo.
     * @param yTempo posição vertical do tempo.
     */
    protected TelaResultado(String imagem, int xPontuacao, int yPontuacao,
                            int xTempo, int yTempo)
    {
        super(1000, 750, 1);
        setBackground(imagem);

        mostrarPontuacao(xPontuacao, yPontuacao);
        mostrarTempo(xTempo, yTempo);
    }

    /**
     * Exibe a pontuação final do jogador.
     */
    private void mostrarPontuacao(int x, int y)
    {
        int pontos = Pontuacao.getTotal();

        GreenfootImage texto = new GreenfootImage(
            String.valueOf(pontos),
            35,
            Color.WHITE,
            new Color(0, 0, 0, 0)
        );

        getBackground().drawImage(texto, x, y);
    }

    /**
     * Exibe o tempo total de duração da partida.
     */
    private void mostrarTempo(int x, int y)
    {
        String tempo = Partida.getTempoFormatado();

        GreenfootImage texto = new GreenfootImage(
            tempo,
            35,
            Color.WHITE,
            new Color(0, 0, 0, 0)
        );

        getBackground().drawImage(texto, x, y);
    }
}

