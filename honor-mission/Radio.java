import greenfoot.*;

/**
 * Item colecionavel que aumenta a pontuacao do jogador.
 *
 * @author Mateus Cunha
 * @version 10/11/2026
 */
public class Radio extends ItemColecionavel
{
    public static final String NOME = "Radio";
    
    public Radio()
    {
        super(NOME, "Uma radio de comunicacao encontrado pelo caminho.", 200);
        setImage("radio.png");
    }
}