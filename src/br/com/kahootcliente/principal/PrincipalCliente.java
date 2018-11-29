package br.com.kahootcliente.principal;

import br.com.kahootcliente.entidade.Pergunta;
import br.com.kahootcliente.entidade.Resposta;
import br.com.kahootcliente.entidade.Servidor;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author William
 */
public class PrincipalCliente {

    public static Servidor CONFIGURACAO_GLOBAL = new Servidor();

    public static List<Pergunta> PERGUNTAS_RECEBIDAS = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        /**
         * Configuracao de Ip e porta Aqui!
         */
        
        CONFIGURACAO_GLOBAL.setIp("localhost");
        CONFIGURACAO_GLOBAL.setPorta(8787);

        PERGUNTAS_RECEBIDAS = (List<Pergunta>) ManterSocketNegocio.recebendoDadosViaSocket(8787);

        for (int i = 0; i < PERGUNTAS_RECEBIDAS.size(); i++) {
            Pergunta get = PERGUNTAS_RECEBIDAS.get(i);
            System.out.println(get.getRespostas().get(0));
            System.out.println(get);
        }

        System.out.println(PERGUNTAS_RECEBIDAS);
    }

//
//        for (int i = 0; i < objRecebidosViaSocket.size(); i++) {
//            Object tipodeObjeto = objRecebidosViaSocket.get(i);
//            System.out.println(tipodeObjeto);
//            if (tipodeObjeto instanceof Pergunta) { // como dar cast em um List<Pergunta> ? // 
//                PERGUNTAS_RECEBIDAS.add((Pergunta) tipodeObjeto);
//            }
//        }
//
//        System.out.println("IMPRESSAO DE PERGUNTAS" + PERGUNTAS_RECEBIDAS);
//    }
}
