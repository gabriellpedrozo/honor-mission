import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rato extends Actor
{
    /**
     * Act - do whatever the Rato wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        perseguir();
    }
    
    /**
     * Faz o rato se voltar para a direcao do jogador e comecar a persegui-lo
     */
    private void perseguir() {
        Patio patio = getWorldOfType(Patio.class);
        Jogador jogador = patio.obterJogador();
        
        turnTowards(jogador.getX(), jogador.getY());
        move(2);
    }
}
