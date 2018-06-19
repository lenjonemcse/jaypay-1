package projeto19.Model;

import java.util.Date;

public  abstract class Assinante {
    public int id;
    public String nome;
    public int pontos = 0;
    public Date cadastro;

    /**
     *
     */
    public static String Assinantes[][] = new String[14][5];
    public int permissao;
}
