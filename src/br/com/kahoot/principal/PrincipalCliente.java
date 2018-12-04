package br.com.kahoot.principal;

import br.com.kahoot.entidade.Disciplina;
import br.com.kahoot.negocio.ManterKahootNegocio;
import br.com.kahoot.entidade.Pergunta;
import br.com.kahoot.entidade.Resposta;
import br.com.kahoot.entidade.Servidor;
import br.com.kahoot.entidade.Usuario;
import br.com.view.FramePrincipal;
import br.com.view.PanelJogar;
import java.net.InetAddress;
import java.net.UnknownHostException;
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

    public static List<Disciplina> DISCIPLINAS_RECEBIDAS = new ArrayList<>();
    public static List<Pergunta> PERGUNTA_RECEBIDAS = new ArrayList<>();
    public static List<Resposta> RESPOSTAS_RECEBIDAS = new ArrayList<>();
    public static Usuario USUARIO_ATUAL = new Usuario();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        /**
         * Primeiro Login
         */
        String ipServidor = JOptionPane.showInputDialog("Digite o IP do Servidor");
        String porta = JOptionPane.showInputDialog("Digite a Porta do Servidor");
        CONFIGURACAO_GLOBAL.setIp(ipServidor);
        CONFIGURACAO_GLOBAL.setPorta(Integer.valueOf(porta));
        pegandoIpDoClienteEEnviandoViaSocket();

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

    private static void pegandoIpDoClienteEEnviandoViaSocket() throws Exception {
        InetAddress ip;

        try {
            PrincipalCliente.USUARIO_ATUAL.setId(1);
            ip = InetAddress.getLocalHost();
            PrincipalCliente.USUARIO_ATUAL.setIp(ip.getHostAddress());

        } catch (UnknownHostException unknownHostException) {
        }
        ManterKahootNegocio.enviandoIpViaSocket(USUARIO_ATUAL.getIp());
    }

    private static boolean recebendoDadosDoServidor() throws Exception {
        try {
            DISCIPLINAS_RECEBIDAS = ManterKahootNegocio.recebendoDisciplinasViaSocket();
            Thread.sleep(5000);
            System.out.println(DISCIPLINAS_RECEBIDAS);
            RESPOSTAS_RECEBIDAS = ManterKahootNegocio.recebendoRespostasViaSocket();
            Thread.sleep(5000);
            System.out.println(RESPOSTAS_RECEBIDAS);
            PERGUNTA_RECEBIDAS = ManterKahootNegocio.recebendoPerguntasViaSocket();
            Thread.sleep(5000);
            System.out.println(PERGUNTA_RECEBIDAS);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    public static void panelUsuarioJogar() throws Exception {
        PanelJogar panel = new PanelJogar();
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

}
