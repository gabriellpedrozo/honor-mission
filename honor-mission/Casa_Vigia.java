import greenfoot.*;
/**
 * essa classe representa o cenário da casa do vigia
 * 
 * @author (Gabriel Pedrozo) 
 * @version (24/10/2026)
 */
public class Casa_Vigia  extends World
{

    /**
     * Constructor for objects of class Casa_Vigia
     */
    public Casa_Vigia()
    {
        super(1588, 622, 1);
        prepare();
    }

    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */

    private void prepare()
    {
        Jogador jogador = new Jogador();
        jogador.getImage().scale(42, 73);
        addObject(jogador, 816, 538);

        Vassoura vassoura = new Vassoura();
        vassoura.getImage().scale(35, 75);
        addObject(vassoura, 333, 188);

        Chave chave = new Chave();
        addObject(chave, 792, 143);

        // Obstáculos do cenário
        Obstaculo obstaculo24 = new Obstaculo(120, 160);
        addObject(obstaculo24, 701, 180);

        Obstaculo obstaculo25 = new Obstaculo(120, 100);
        addObject(obstaculo25, 112, 137);

        Obstaculo obstaculo3 = new Obstaculo(120, 100);
        addObject(obstaculo3, 240, 137);

        Obstaculo obstaculo5 = new Obstaculo(40, 180);
        addObject(obstaculo5, 71, 368);

        Obstaculo obstaculo6 = new Obstaculo(40, 65);
        addObject(obstaculo6, 116, 472);

        Obstaculo obstaculo7 = new Obstaculo(40, 65);
        addObject(obstaculo7, 109, 520);

        Obstaculo obstaculo8 = new Obstaculo(60, 160);
        addObject(obstaculo8, 1546, 329);

        Obstaculo obstaculo9 = new Obstaculo(60, 130);
        addObject(obstaculo9, 1533, 144);

        Obstaculo obstaculo27 = new Obstaculo(30, 60);
        addObject(obstaculo27, 1572, 497);

        // Parede inferior
        Obstaculo obstaculo10 = new Obstaculo(1588, 25);
        addObject(obstaculo10, 803, 583);

        Obstaculo obstaculo11 = new Obstaculo(65, 60);
        addObject(obstaculo11, 826, 136);

        Obstaculo obstaculo12 = new Obstaculo(80, 75);
        addObject(obstaculo12, 1070, 134);

        Obstaculo obstaculo13 = new Obstaculo(350, 20);
        addObject(obstaculo13, 470, 112);

        Obstaculo obstaculo14 = new Obstaculo(190, 20);
        addObject(obstaculo14, 974, 120);

        Obstaculo obstaculo15 = new Obstaculo(350, 20);
        addObject(obstaculo15, 1295, 120);

        Obstaculo obstaculo16 = new Obstaculo(20, 20);
        addObject(obstaculo16, 1467, 233);

        Obstaculo obstaculo17 = new Obstaculo(20, 20);
        addObject(obstaculo17, 1467, 252);

        Obstaculo obstaculo18 = new Obstaculo(45, 45);
        addObject(obstaculo18, 1484, 372);

        Obstaculo obstaculo19 = new Obstaculo(110, 110);
        addObject(obstaculo19, 871, 380);

        Obstaculo obstaculo20 = new Obstaculo(50, 60);
        addObject(obstaculo20, 1451, 166);

        // Parede lateral esquerda
        Obstaculo obstaculo21 = new Obstaculo(25, 622);
        addObject(obstaculo21, 15, 296);

        Obstaculo obstaculo23 = new Obstaculo(35, 120);
        addObject(obstaculo23, 349, 123);

        Obstaculo obstaculo22 = new Obstaculo(45, 40);
        addObject(obstaculo22, 338, 170);

        Obstaculo obstaculo28 = new Obstaculo(45, 50);
        addObject(obstaculo28, 418, 178);
    }
}