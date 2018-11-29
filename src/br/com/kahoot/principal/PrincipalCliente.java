package br.com.kahoot.principal;

import br.com.kahoot.entidade.Assunto;
import br.com.kahoot.entidade.Disciplina;
import br.com.kahoot.negocio.ManterKahootNegocio;
import br.com.kahoot.entidade.Pergunta;
import br.com.kahoot.entidade.Resposta;
import br.com.kahoot.entidade.Servidor;
import br.com.kahoot.entidade.Usuario;
import br.com.view.FramePrincipal;
import br.com.view.PanelJogar;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class PrincipalCliente {

    public static Servidor CONFIGURACAO_GLOBAL = new Servidor();

    private static FramePrincipal frame;

    public static List<Disciplina> DISCPLINAS_RECEBIDAS = new ArrayList<>();
    public static List<Pergunta> PERGUNTA_RECEBIDAS = new ArrayList<>();
    public static List<Resposta> RESPOSTAS_RECEBIDAS = new ArrayList<>();
    public static List<Usuario> USUARIOS_RECEBIDOS = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        CONFIGURACAO_GLOBAL.setIp("192.168.109.46");
        CONFIGURACAO_GLOBAL.setPorta(8989);

        boolean recebido = recebendoDadosDoServidor();

        if (!recebido) {
            JOptionPane.showMessageDialog(null, "Problemas no Servidor verificar!");
        }

        frame = new FramePrincipal();
        frame.setTitle("Quiz Senac!");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        /**
         * Configuracao de Ip e porta Aqui!
         */
    }

    private static boolean recebendoDadosDoServidor() throws Exception {
        try {
            DISCPLINAS_RECEBIDAS = ManterKahootNegocio.recebendoDisciplinasViaSocket();
            System.out.println(DISCPLINAS_RECEBIDAS);
            RESPOSTAS_RECEBIDAS = ManterKahootNegocio.recebendoRespostasViaSocket();
            System.out.println(RESPOSTAS_RECEBIDAS);
            PERGUNTA_RECEBIDAS = ManterKahootNegocio.recebendoPerguntasViaSocket();
            System.out.println(PERGUNTA_RECEBIDAS);
            USUARIOS_RECEBIDOS = ManterKahootNegocio.recebendoUsuariosViaSocket();
            System.out.println(USUARIOS_RECEBIDOS);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    public static void panelUsuarioJogar(List<Pergunta> perguntas) throws Exception {
        PanelJogar panel = new PanelJogar(perguntas);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

}
