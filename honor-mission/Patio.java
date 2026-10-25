import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Patio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Patio extends World
{
    /**
     * Constructor for objects of class Patio.
     * 
     */
    public Patio()
    {    
        // Create a new world with 800x600 cells with a cell size of 1x1 pixels.
        super(1000, 750, 1); 
        prepare();
    }
    
    /**
     * Retorna o unico jogador que esta no mundo.
     * Se nao encontrar, retorna null.
     */
    public Jogador obterJogador() {
        List<Jogador> listaJogadores = this.getObjects(Jogador.class);
        
        return listaJogadores.get(0);
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        Jogador jogador = new Jogador();
        addObject(jogador,883,523);
        Vigia vigia = new Vigia();
        addObject(vigia,754,265);
        Rato rato = new Rato();
        addObject(rato,354,265);
        Rato rato2 = new Rato();
        addObject(rato2,452,307);
        Rato rato3 = new Rato();
        addObject(rato3,451,254);
        Rato rato4 = new Rato();
        addObject(rato4,375,313);
    }
}
