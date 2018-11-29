package br.com.kahoot.principal;

import br.com.kahoot.negocio.ManterKahootNegocio;
import br.com.kahoot.entidade.Disciplina;
import br.com.kahoot.entidade.Pergunta;
import br.com.kahoot.entidade.Resposta;
import br.com.kahoot.entidade.Servidor;
import br.com.kahoot.entidade.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author William
 */
public class PrincipalCliente {

    public static Servidor CONFIGURACAO_GLOBAL = new Servidor();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        /**
         * Configuracao de Ip e porta Aqui!
         */
        CONFIGURACAO_GLOBAL.setIp("localhost");
        CONFIGURACAO_GLOBAL.setPorta(8787);

        List<Pergunta> objetosRecebidosParaTeste = ManterKahootNegocio.recebendoPerguntasViaSocket();

        for (int i = 0; i < objetosRecebidosParaTeste.size(); i++) {
            System.out.println(objetosRecebidosParaTeste.get(i));

        }
    }

}
