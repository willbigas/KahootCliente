package br.com.kahoot.negocio;

import br.com.kahoot.entidade.Disciplina;
import br.com.kahoot.entidade.Pergunta;
import br.com.kahoot.entidade.Resposta;
import br.com.kahoot.entidade.Usuario;
import br.com.kahoot.principal.PrincipalCliente;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class ManterKahootNegocio {

    /**
     * Disciplinas via Socket *
     */
    public static boolean enviandoDisciplinasViaSocket(List<Disciplina> disciplinas) throws Exception {
        try {
            ManterSocketNegocio.enviandoDadosViaSocket(PrincipalCliente.CONFIGURACAO_GLOBAL.getIp(),
                    PrincipalCliente.CONFIGURACAO_GLOBAL.getPorta(), disciplinas);
            return true;
        } catch (Exception exception) {
            return false;
        }

    }

    public static List<Disciplina> recebendoDisciplinasViaSocket() throws Exception {
        List<Disciplina> disciplinas = (List<Disciplina>) ManterSocketNegocio.recebendoDadosViaSocket(
                PrincipalCliente.CONFIGURACAO_GLOBAL.getPorta());
        return disciplinas;
    }

    /**
     * Perguntas via Socket *
     */
    public static boolean enviandoPerguntasViaSocket(List<Pergunta> perguntas) throws Exception {
        try {
            ManterSocketNegocio.enviandoDadosViaSocket(PrincipalCliente.CONFIGURACAO_GLOBAL.getIp(),
                    PrincipalCliente.CONFIGURACAO_GLOBAL.getPorta(), perguntas);
            return true;
        } catch (Exception exception) {
            return false;
        }

    }

    public static List<Pergunta> recebendoPerguntasViaSocket() throws Exception {
        List<Pergunta> perguntas = (List<Pergunta>) ManterSocketNegocio.recebendoDadosViaSocket(
                PrincipalCliente.CONFIGURACAO_GLOBAL.getPorta());
        return perguntas;
    }

    /**
     * Respostas Via Socket *
     */
    public static boolean enviandoRespostasViaSocket(List<Resposta> respostas) throws Exception {
        try {
            ManterSocketNegocio.enviandoDadosViaSocket(PrincipalCliente.CONFIGURACAO_GLOBAL.getIp(),
                    PrincipalCliente.CONFIGURACAO_GLOBAL.getPorta(), respostas);
            return true;
        } catch (Exception exception) {
            return false;
        }

    }

    public static List<Resposta> recebendoRespostasViaSocket() throws Exception {
        List<Resposta> respostas = (List<Resposta>) ManterSocketNegocio.recebendoDadosViaSocket(
                PrincipalCliente.CONFIGURACAO_GLOBAL.getPorta());
        return respostas;
    }

    /**
     * Usuario via Socket *
     */
    public static boolean enviandoUsuarioViaSocket(Usuario usuario) throws Exception {
        try {
            ManterSocketNegocio.enviandoDadosViaSocket(PrincipalCliente.CONFIGURACAO_GLOBAL.getIp(),
                    PrincipalCliente.CONFIGURACAO_GLOBAL.getPorta(), usuario);
            return true;
        } catch (Exception exception) {
            return false;
        }

    }

    public static List<Usuario> recebendoUsuariosViaSocket() throws Exception {
        List<Usuario> usuarios = (List<Usuario>) ManterSocketNegocio.recebendoDadosViaSocket(
                PrincipalCliente.CONFIGURACAO_GLOBAL.getPorta());
        return usuarios;
    }
    
    
    public static boolean enviandoIpViaSocket(String ip) throws Exception {
        try {
            ManterSocketNegocio.enviandoDadosViaSocket(PrincipalCliente.CONFIGURACAO_GLOBAL.getIp(),
                    PrincipalCliente.CONFIGURACAO_GLOBAL.getPorta(), ip);
            return true;
        } catch (Exception exception) {
            return false;
        }

    }

}
