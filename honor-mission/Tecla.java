import greenfoot.*;

/**
 * Representa uma tecla do teclado e detecta o momento exato em que
 * ela é apertada, ignorando os acts em que ela apenas continua pressionada.
 *
 * @author Mateus Cunha
 * @version 18/11/2026
 */
public class Tecla
{
    private String nome;                 // nome da tecla no Greenfoot (ex.: "space", "e")
    private boolean estavaPressionada;   // estado da tecla no act anterior
    
    /**
     * Cria o monitor de uma tecla.
     *
     * @param nome nome da tecla, como aceito por Greenfoot.isKeyDown.
     */
    public Tecla(String nome)
    {
        this.nome = nome;
        estavaPressionada = false;
    }
    
    /**
     * Deve ser chamado uma vez por act.
     *
     * @return true somente no act em que a tecla passou de solta para pressionada.
     */
    public boolean foiApertada()
    {
        boolean agora = Greenfoot.isKeyDown(nome);
        boolean apertouAgora = agora && !estavaPressionada;

        estavaPressionada = agora;
        return apertouAgora;
    }
}