import greenfoot.*;
import java.util.List;

/**
 * Item utilizável que permite ao jogador atacar os ratos.
 *
 * @author Gabriel Pedrozo && Mateus Cunha
 * @version 24/10/2026
 */
public class Vassoura extends ItemUtilizavel
{
    /** Nome usado para identificar a vassoura no inventário. */
    public static final String NOME = "Vassoura";
    private static final int ALCANCE = 70;
    private static final int PONTOS_POR_RATO = 50;
    /* 
     * Esse atributo faz sentido ser publico, ja que ele que a sua funcao eh
     * ser um identificador no inventario. Outras classes precisarao acessa-lo.
     * Alem disso, ele eh uma constante, ninguem vai conseguir altera-lo, logo
     * nao fere o conceito de encapsulamento
     */
    /**
     * Cria a vassoura.
     */
    public Vassoura()
    {
        super(NOME, "Permite atacar os ratos.");
        setImage("vassoura.png");
    }
    
    /**
     * Da uma vassourada.
     */
    @Override
    protected boolean usar(Jogador jogador) {
        Greenfoot.playSound("vassourada.wav");
        
        List<Rato> ratos = jogador.getWorld().getObjects(Rato.class);
        for (Rato rato : ratos) {
            if ( (Math.abs(rato.getX() - jogador.getX()) < ALCANCE) &&
            (Math.abs(rato.getY() - jogador.getY()) < ALCANCE) ) {
                jogador.getWorld().removeObject(rato);
                Jogador.adicionarPontos(PONTOS_POR_RATO);
                Greenfoot.playSound("rato_morrendo.wav");
            }
        }
        return true;
    }
}