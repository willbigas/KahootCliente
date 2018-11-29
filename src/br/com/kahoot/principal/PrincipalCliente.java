package br.com.kahoot.principal;

import br.com.kahoot.negocio.ManterKahootNegocio;
import br.com.kahoot.entidade.Pergunta;
import br.com.kahoot.entidade.Servidor;
import br.com.view.FramePrincipal;
import br.com.view.PanelJogar;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author William
 */
public class PrincipalCliente {

    public static Servidor CONFIGURACAO_GLOBAL = new Servidor();

    private static FramePrincipal frame;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        frame = new FramePrincipal();
        frame.setTitle("Quiz Senac!");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        /**
         * Configuracao de Ip e porta Aqui!
         */
        CONFIGURACAO_GLOBAL.setIp("192.168.109.46");
        CONFIGURACAO_GLOBAL.setPorta(8787);

        List<Pergunta> objetosRecebidosParaTeste = ManterKahootNegocio.recebendoPerguntasViaSocket();

        for (int i = 0; i < objetosRecebidosParaTeste.size(); i++) {
            System.out.println(objetosRecebidosParaTeste.get(i));

        }
    }

    public static void panelUsuarioJogar() throws Exception {
        PanelJogar panel = new PanelJogar();
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

}
