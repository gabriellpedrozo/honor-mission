import greenfoot.*;

/**
 * Item utilizável que permite ao jogador atirar nos patifes.
 * Não é consumível: fica no inventário depois de coletada.
 *
 * @author Mateus Cunha
 * @version 18/11/2026
 */
public class Arma extends ItemUtilizavel
{
    public static final String NOME = "Arma";
    
    /**
     * Cria a arma.
     */
    public Arma()
    {
        super(NOME, "Permite atirar nos patifes.");
        setImage("vassoura.png");
    }
    
    /**
     * Dispara um tiro a partir do jogador, na direção em que ele olha.
     */
    @Override
    protected boolean usar(Jogador jogador)
    {
        Tiro tiro = new Tiro(jogador.getDirecao(), true);
        jogador.getWorld().addObject(tiro, jogador.getX(), jogador.getY());
        Greenfoot.playSound("tiro.wav");

        return true;
    }
}