/**
 * Item que o jogador guarda no inventário e pode utilizar.
 *
 * @author Gabriel Pedrozo && Mateus Cunha
 * @version 10/11/2026
 */
public class ItemUtilizavel extends Item
{
    private boolean consumivel;

    /**
     * Cria um item utilizável permanente (não some ao ser usado).
     *
     * @param nome nome do item.
     * @param descricao breve descrição do item.
     */
    public ItemUtilizavel(String nome, String descricao)
    {
        super(nome, descricao);
        this.consumivel = false;
    }

    /**
     * Cria um item utilizável.
     *
     * @param nome nome do item.
     * @param descricao breve descrição do item.
     * @param consumivel true se o item some do inventário após ser usado.
     */
    public ItemUtilizavel(String nome, String descricao, boolean consumivel)
    {
        super(nome, descricao);
        this.consumivel = consumivel;
    }
    
    /**
     * Ao ser coletado, vai para o inventário do jogador.
     */
    @Override
    public void coletadoPor(Jogador jogador)
    {
        jogador.adicionarAoInventario(this);
    }
    
    /**
     * @return true se o item é consumido ao ser usado.
     */
    public boolean isConsumivel()
    {
        return consumivel;
    }

    /**
     * Usa o item sobre o jogador. Por enquanto não faz nada, deve ser sobrescrito.
     *
     * @param jogador jogador que está usando o item.
     * @return true se o item foi realmente usado.
     */
    protected boolean usar(Jogador jogador)
    {
        return false;
    }
}