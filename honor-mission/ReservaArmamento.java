import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Representa o local onde estao armazenados os materiais belicos.
 * 
 * @author Mateus Cunha
 * @version 18/11/2026
 */
public class ReservaArmamento extends MundoJogo
{
    /**
     * Construtor para a Reserva de Armamento.
     * 
     */
    public ReservaArmamento()
    {
        super(1000, 750);
        prepare();
    }
    
    /**
     * A cada act, verifica se todos os patifes foram derrotados.
     */
    @Override
    public void act()
    {
        super.act(); // roda o act do MundoJogo (vidas / game over)
    
        if (!Vidas.acabaram() && getObjects(Patife.class).isEmpty())
        {
            Partida.vencer();
        }
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        Jogador jogador = new Jogador();
        addObject(jogador, 501, 606);
        
        // adiciona os paineis, herda de MundoJogo
        adicionarPaineis();
        
        // adiciona os patifes
        addObject(new Patife(0), 300, 200);
        addObject(new Patife(30), 700, 200);
        addObject(new Patife(60), 500, 400);
    }
}
