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
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        Jogador jogador = new Jogador();
        addObject(jogador, 501, 606);
        
        // adiciona os paineis, herda de MundoJogo
        adicionarPaineis();
    }
}
