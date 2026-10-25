import greenfoot.*;
/**
 * essa classe representa o cenário da casa do vigia
 * 
 * @author (Gabriel Pedrozo && Mateus Cunha) 
 * @version (24/10/2026)
 */
public class CasaVigia  extends World
{
    private World mundoAnterior;
    
    /**
     * Construtor do mundo Casa do Vigia.
     */
    public CasaVigia(World patio)
    {
        super(1200, 470, 1);
        this.mundoAnterior = patio;
        prepare();
    }

    /**
     * Volta para o mundo anterior.
     */
    public void voltarAoMundoAnterior() {
        Greenfoot.setWorld(mundoAnterior);
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */

    private void prepare()
    {
        Jogador jogador = new Jogador();
        jogador.getImage().scale(35, 61);
        addObject(jogador, 612, 375);

        Vassoura vassoura = new Vassoura();
        vassoura.getImage().scale(35, 75);
        addObject(vassoura, 257, 130);
        
        // configuracoes da passagem de volta para o patio
        Passagem saida = new Passagem (50, 20, mundoAnterior, 776, 187);
        addObject(saida, 612, 429);
    }
}