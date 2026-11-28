import greenfoot.*;

/**
 * Classe base para todos os itens do jogo.
 *
 * @author Gabriel Pedrozo && Mateus Cunha
 * @version 10/11/2026
 */
public abstract class Item extends Actor
{
    private String nome;
    private String descricao;

    /**
     * Cria um item.
     *
     * @param nome nome do item.
     * @param descricao breve descrição do item.
     */
    public Item(String nome, String descricao)
    {
        this.nome = nome;
        this.descricao = descricao;
    }

    /**
     * @return o nome do item.
     */
    public String getNome()
    {
        return nome;
    }

    /**
     * @return a descrição do item.
     */
    public String getDescricao()
    {
        return descricao;
    }
    
    /**
     * Define o que acontece quando o jogador coleta este item.
     * Cada tipo de item decide onde ele é guardado.
     *
     * @param jogador jogador que coletou o item.
     */
    public abstract void coletadoPor(Jogador jogador);
}