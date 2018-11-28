package br.com;

import br.com.kahoot.entidade.Pergunta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author William
 */
public class PrincipalCliente {

    public static List<Pergunta> PERGUNTAS_RECEBIDAS = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        List<Pergunta> objRecebidos = (List<Pergunta>) ManterSocketNegocio.recebendoDadosViaSocket(8787);
        
        for (int i = 0; i < objRecebidos.size(); i++) {
            Pergunta get = objRecebidos.get(i);
            PERGUNTAS_RECEBIDAS.add(get);
            System.out.println(get);
        }

    }

}
