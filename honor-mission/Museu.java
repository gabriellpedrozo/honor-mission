
import greenfoot.*;
import java.util.List;

/**
 * Representa o museu de relíquias do quartel, onde o jogador
 * precisa encontrar uma maneira de desativar os lasers.
 *
 * @author Mateus Cunha && Gabriel Pedrozo
 * @version 15/11/2026
 */
public class Museu extends World
{
    private static boolean lasersAtivos = true;
    private boolean estadoAtualizado = false;
    private World mundoAnterior;

    /**
     * Cria o mundo Museu e prepara o cenário.
     */
    public Museu(World quartel)
    {
        super(1000, 750, 1);
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
    public void act()
    {
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
        
        //Responsavel pelas vidas e sua exibição
        PainelVidas painelVidas = new PainelVidas(getWidth() - 80, getHeight() - 25);
        painelVidas.adicionarAoMundo(this);

        //responsavel pelos pontos e sua exibição
        PainelPontuacao painelPontuacao = new PainelPontuacao(100, getHeight() -25);
        painelPontuacao.adicionarAoMundo(this);
        
        // configuracoes da passagem de volta para o quartel
        Passagem saida = new Passagem (25, 78, mundoAnterior, 139, 367);
        addObject(saida, 926, 389);

        if (lasersAtivos)
        {
            Lasers lasers = new Lasers(60, 70);
            addObject(lasers, 877, 272);
        }
    }
}

