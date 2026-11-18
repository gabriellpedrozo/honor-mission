import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Passagem para a terceira fase.
 * 
 * @author Mateus Cunha
 * @version 14/11/2026
 */
public class PassagemFase3 extends Passagem
{
    private boolean trancado = true;
    
    /**
     * Construtor padrao da PassagemFase3
     */
    public PassagemFase3(int largura, int altura, World destino, int destinoX, int destinoY)
    {
        super(largura, altura, destino, destinoX, destinoY);
    }
    
    /**
     * Destranca a porta para a fase 3.
     */
    public void destrancar() {
        trancado = false;
    }
    
    /**
     * So pode passar se houve desbloqueio com a chave.
     */
    @Override
    protected boolean podePassar() {
        return !trancado;
    }
    
    @Override
    protected String mensagemBloqueio() {
        return "Destranque a porta usando o cartao!";
    }
    
    /**
     * @return true se a porta ainda esta trancada.
     */
    public boolean estaTrancada()
    {
        return trancado;
    }
}
