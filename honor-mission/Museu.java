
import greenfoot.*;
import java.util.List;

/**
 * Representa o museu de relíquias do quartel, onde o jogador
 * precisa encontrar uma maneira de desativar os lasers.
 *
 * @author Mateus Cunha && Gabriel Pedrozo
 * @version 15/11/2026
 */
public class Museu extends MundoJogo
{
    private static boolean lasersAtivos = true;
    private boolean estadoAtualizado = false;
    private World mundoAnterior;

    /**
     * Cria o mundo Museu e prepara o cenário.
     */
    public Museu(World quartel)
    {
        super(1000, 750);
        this.mundoAnterior = quartel;

        if (lasersAtivos)
        {
            setBackground("museu_laser.png");
        }
        else
        {
            setBackground("museu.png");
        }

        prepare();
    }

    /**
     * Desativa os lasers do Museu.
     */
    public static void desativarLasers()
    {
        lasersAtivos = false;
    }

    /**
     * Reinicia os lasers para uma nova partida.
     */
    public static void reiniciarLasers()
    {
        lasersAtivos = true;
    }

    /**
     * Verifica se o estado dos lasers mudou.
     * Atualiza o cenário e remove os lasers quando necessário.
     */
    @Override
    public void act()
    {
        super.act(); // precisar rodar o act do MundoJogo
        
        if (!lasersAtivos && !estadoAtualizado)
        {
            setBackground("museu.png");
            List<Lasers> lasers = getObjects(Lasers.class);

            for (Lasers laser : lasers)
            {
                removeObject(laser);
            }

            estadoAtualizado = true;
        }
    }

    /**
     * Prepara o mundo, adicionando o jogador e os lasers.
     */
    private void prepare()
    {
        Jogador jogador = new Jogador();
        addObject(jogador, 883, 523);
        
        // adiciona os paineis, herda de MundoJogo
        adicionarPaineis();
        
        // configuracoes da passagem de volta para o quartel
        Passagem saida = new Passagem (25, 78, mundoAnterior, 139, 367);
        addObject(saida, 926, 389);
        
        // adicionando os itens do museu
        Cartao cartao = new Cartao();
        addObject(cartao, 74, 363);
        
        Arma arma = new Arma();
        addObject(arma, 500, 150);

        if (lasersAtivos)
        {
            Lasers lasers = new Lasers(60, 70);
            addObject(lasers, 877, 272);
        }
    }
}

