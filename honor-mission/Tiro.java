import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe que representa o disparo da arma de fogo.
 * 
 * @author (Mateus Cunha) 
 * @version (06/11/2026)
 */
public class Tiro extends Actor
{
    private static final int VELOCIDADE = 6;
    private boolean doJogador; // true se foi o jogador quem atirou

    /**
     * Cria um tiro de vilao (fere o jogador).
     *
     * @param anguloGraus direcao do tiro (0 = direita, 90 = baixo)
     */
    public Tiro(int anguloGraus)
    {
        this(anguloGraus, false);
    }
    
    /**
     * Cria um tiro.
     *
     * @param anguloGraus direcao do tiro (0 = direita, 90 = baixo)
     * @param doJogador true se o tiro foi disparado pelo jogador
     */
    public Tiro(int anguloGraus, boolean doJogador) {
        this.doJogador = doJogador;
        setImage("tiro1.png");
        setRotation(anguloGraus);
    }
    
    /**
     * O tiro se move na direcao do angulo inicial. Se encosta na parede
     * (obstaculo ou limites do mapa) some. Se acerta um alvo, causa dano.
     */
    public void act()
    {
        move(VELOCIDADE);

        if (isAtEdge() || isTouching(Obstaculo.class)) {
            getWorld().removeObject(this);
            return;
        }
        
        if (doJogador) {
            acertarVilao();
        } else {
            acertarJogador();
        }
    }
    
    /**
     * Tiro de vilao: tira uma vida do jogador, se acertar.
     */
    private void acertarJogador()
    {
        if (isTouching(Jogador.class)) {
            Vidas.perder();
            getWorld().removeObject(this);
        }
    }
    
    /**
     * Tiro do jogador: causa dano no vilao atingido, se acertar.
     */
    private void acertarVilao()
    {
        Vilao alvo = (Vilao) getOneIntersectingObject(Vilao.class);
        
        if (alvo != null) {
            alvo.sofrerTiro();
            getWorld().removeObject(this);
        }
    }
}
