/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kahootcliente.principal;

import br.com.kahootcliente.entidade.Disciplina;
import br.com.kahootcliente.entidade.Pergunta;
import br.com.kahootcliente.entidade.Resposta;
import br.com.kahootcliente.entidade.Usuario;
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
    public static boolean enviandoPerguntaViaSocket(List<Pergunta> perguntas) throws Exception {
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
    public static boolean enviandoUsuarioViaSocket(List<Usuario> usuarios) throws Exception {
        try {
            ManterSocketNegocio.enviandoDadosViaSocket(PrincipalCliente.CONFIGURACAO_GLOBAL.getIp(),
                    PrincipalCliente.CONFIGURACAO_GLOBAL.getPorta(), usuarios);
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

}
