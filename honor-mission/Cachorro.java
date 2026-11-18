import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Essa classe representa o cao de guarda. Ele eh um inimigo que morde o player.
 * 
 * @author Mateus Cunha
 * @version 14/11/2026
 */
public class Cachorro extends Vilao
{
    private static final int TEMPO_MORDIDA = 45; // morde mais rapido que o rato
    
    /**
     * Construtor cachorro.
     */
    public Cachorro()
    {
        setImage("cachorro_mini.png");
    }
    
    /**
     * O cachorro procura pelo jogador. Se o encontra, persegue-o e tenta morder.
     * Se nao, ele fica vagueando pelo mapa.
     */
    public void act()
    {
        atualizarRecarga();
        
        Jogador alvo = getJogadorPerto();

        if (alvo != null)
        {
            perseguir(alvo, 2);
        }
        else
        {
            vaguear(1);
        }

        morder(TEMPO_MORDIDA, "rosnado_assustador.wav");
    }
}
