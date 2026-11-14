import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Museu de reliquias do quartel. Cuidado com o alarme
 * 
 * @author Mateus Cunha && Gabriel Pedrozo
 * @version 14/11/2026
 */
public class Museu extends World
{
    /**
     * Construtor para o Museu.
     * 
     */
    public Museu()
    {    
        // Create a new world with 1000x750 cells with a cell size of 1x1 pixels.
        super(1000, 750, 1); 
        prepare();
    }
    
     /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        Jogador jogador = new Jogador();
        addObject(jogador,883,523);
    }
}
