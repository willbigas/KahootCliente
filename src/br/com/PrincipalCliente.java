package br.com;

import br.com.kahoot.entidade.Pergunta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author William
 */
public class PrincipalCliente {

    public static List<Pergunta> PERGUNTAS_RECEBIDAS;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        List<Object> objRecebidosViaSocket = (List<Object>) ManterSocketNegocio.recebendoDadosViaSocket(8787);

        
        for (int i = 0; i < objRecebidosViaSocket.size(); i++) {
            Object tipodeObjeto = objRecebidosViaSocket.get(i);
            System.out.println(tipodeObjeto);
            if (tipodeObjeto instanceof Pergunta) { // como dar cast em um List<Pergunta> ? // 
                PERGUNTAS_RECEBIDAS.add((Pergunta) tipodeObjeto);
            }
        }
        
        System.out.println("IMPRESSAO DE PERGUNTAS" + PERGUNTAS_RECEBIDAS);
    }

}
