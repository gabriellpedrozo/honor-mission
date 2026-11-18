import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
 
/**
 * Representa o player: soldado que vai cumprir a missao no TG.
 * 
 * @author (Mateus Cunha && Gabriel Pedrozo) 
 * @version (15/11/2026)
 */
public class Jogador extends Actor
{
    // atributos constantes para evitar numeros soltos
    private static final int VELOCIDADE = 4;
    private static final int ALCANCE_COLETA = 50;
    
    private boolean espacoPressionado; // evita repetir o golpe enquanto segura a tecla
    private boolean ePressionado; // evita repetir acao enquanto segura a tecla
    private boolean cPressionado; // evita repetir o uso do cartao enquanto segura a tecla
    
    private Inventario inventario;
    private Colecao colecao;
    private String sufixoImagem; // complemento do nome da imagem (ex.: "_casa")
    
    /**
     * Construtor padrao para Jogador
     */
    public Jogador()
    {
        espacoPressionado = false;
        ePressionado = false;
        cPressionado = false;
        
        inventario = new Inventario();
        colecao = new Colecao();
        
        sufixoImagem = "";
        setImage("jogador_frente.png");
    }
 
    /**
     * A cada act: verifica fim de jogo, reduz a invulnerabilidade,
     * e trata movimento, coleta de itens e ataque.
     */
    public void act()
    {
        if (Vidas.acabaram()) {
            MusicaFundo.parar();
            Greenfoot.playSound("game_over.wav");
            Greenfoot.setWorld(new TelaInicial());
            return;
        }
        Vidas.passarTempo();
    
        movimentar();
        coletarItem();
        atacar();
        usarCartao();
    }
 
    /**
     * Faz o jogador se movimentar pelo mapa
     */
    private void movimentar() {
        if (Greenfoot.isKeyDown("left"))
        {
            definirImagem("esquerda");
            setLocation(getX() - VELOCIDADE, getY());
        }
    
        if (Greenfoot.isKeyDown("right"))
        {
            definirImagem("direita");
            setLocation(getX() + VELOCIDADE, getY());
        }
    
        if (Greenfoot.isKeyDown("up"))
        {
            definirImagem("costas");
            setLocation(getX(), getY() - VELOCIDADE);
        }
    
        if (Greenfoot.isKeyDown("down"))
        {
            definirImagem("frente");
            setLocation(getX(), getY() + VELOCIDADE);
        }
    }
    
    /**
     * Escolhe a imagem da direção informada, acrescentando o sufixo
     * definido pelo mundo.
     *
     * @param direcao "esquerda", "direita", "costas" ou "frente".
     */
    private void definirImagem(String direcao)
    {
        setImage("jogador_" + direcao + sufixoImagem + ".png");
    }
    
    /**
     * Sobrescreve um metodo de ator para definir a imagem inicial do jogador.
     */
    @Override
    public void addedToWorld(World mundo)
    {
        definirImagem("frente");
    }
    
    /**
     * Define um sufixo para os arquivos de imagem do jogador, permitindo
     * que o mundo escolha a aparência (ex.: "_casa"). Deve ser chamado
     * antes de adicionar o jogador ao mundo.
     *
     * @param sufixoImagem sufixo acrescentado ao nome da imagem; "" para nenhum.
     */
    public void setSufixoImagem(String sufixoImagem)
    {
        this.sufixoImagem = sufixoImagem;
    }
    
    /**
     * Se o jogador tiver a vassoura e apertar espaco, da uma vassourada:
     * todo rato dentro do alcance morre com um unico golpe.
     */
    private void atacar() {
        boolean espacoAgora = Greenfoot.isKeyDown("space");
 
        // so ataca no momento em que a tecla eh apertada (nao enquanto segura)
        if (espacoAgora && !espacoPressionado) {
            inventario.usar(Vassoura.NOME, this);
        }
 
        espacoPressionado = espacoAgora;
    }

    /**
     * Se o jogador apertar C, tenta usar o cartao do inventario.
     * O cartao so eh consumido se realmente destrancar alguma porta.
     */
    private void usarCartao()
    {
        boolean cAgora = Greenfoot.isKeyDown("c");
    
        // so age no momento em que a tecla eh apertada (nao enquanto segura)
        if (cAgora && !cPressionado)
        {
            inventario.usar(Cartao.NOME, this);
        }
    
        cPressionado = cAgora;
    }
    
    //metodos itens 
    /**
     * Adiciona um item utilizável ao inventário.
     */
    public void adicionarAoInventario(ItemUtilizavel item)
    {
        inventario.adicionar(item);
    }
    
    /**
     * Retorna o inventario do jogador.
     */
    public Inventario getInventario()
    {
        return inventario;
    }
 
    /**
     * Adiciona um item colecionável à coleção.
     */
    public void adicionarNaColecao(ItemColecionavel item)
    {
        if (item != null)
        {
            colecao.adicionar(item);
            Pontuacao.adicionar(item.getPontos());
        }
    }
 
    /**
     * Transfere o inventario e a colecao para o jogador do proximo mundo.
     */
    public void transferirItensPara(Jogador destino)
    {
        destino.inventario = this.inventario;
        destino.colecao = this.colecao;
    }
 
    /**
     * Verifica se o jogador pode coletar um item próximo.
     */
    private void coletarItem()
    {
        boolean eAgora = Greenfoot.isKeyDown("e");
 
        if (eAgora && !ePressionado)
        {
            List<Item> itens = getObjectsInRange(ALCANCE_COLETA, Item.class);
 
            if (!itens.isEmpty())
            {
                Item item = itens.get(0);
 
                if (item instanceof ItemUtilizavel)
                {
                    adicionarAoInventario((ItemUtilizavel) item);
                }
                else if (item instanceof ItemColecionavel)
                {
                    adicionarNaColecao((ItemColecionavel) item);
                }
 
                getWorld().removeObject(item);
                Greenfoot.playSound("pegar_item.wav");
            }
        }
 
        ePressionado = eAgora;
    }
}