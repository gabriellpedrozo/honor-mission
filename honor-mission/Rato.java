import greenfoot.*;

/**
 * Rato que vagueia pelo mapa, persegue o jogador quando ele chega perto
 * e o morde, tirando uma vida.
 *
 * @author Mateus Cunha
 * @version 22/10/2026
 */
public class Rato extends Vilao
{
    private static final int TEMPO_MORDIDA = 60; // acts entre mordidas (~1s)
    private static final int PONTOS_AO_MORRER = 50;
    
    /**
     * Construtor para a classe Rato.
     */
    public Rato() {
        setImage("rato.png");
    }
    
    /**
     * Persegue o jogador se ele estiver perto, senão vagueia.
     * Em seguida tenta morder.
     */
    public void act()
    {
        atualizarRecarga();

        if (jogadorPerto())
        {
            perseguir(2);
        }
        else
        {
            vaguear(1);
        }

        morder(TEMPO_MORDIDA, "mordida.wav");
    }
    
    /**
     * O rato morre com um golpe: sai do mundo, dá pontos e toca o som de morte.
     */
    @Override
    public void sofrerVassourada()
    {
        Pontuacao.adicionar(PONTOS_AO_MORRER);
        Greenfoot.playSound("rato_morrendo.wav");
        getWorld().removeObject(this);
    }
}