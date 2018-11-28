package br.com;

import br.com.kahoot.entidade.Assunto;
import br.com.kahoot.entidade.Disciplina;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author William
 */
public class PrincipalCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Disciplina disciplina = new Disciplina();
        disciplina.setId(1);
        disciplina.setNome("POO");
        disciplina.setProfessor("Felipe");
        
        Assunto assunto = new Assunto();
        assunto.setDisciplina(disciplina);
        assunto.setId(1);
        assunto.setNome("Encapsulamento");
        Object objDisciplina = disciplina;
        Object ObjAssunto = assunto;
        List<Object> OBJECTS = new ArrayList<>();
        OBJECTS.add(ObjAssunto);
        OBJECTS.add(objDisciplina);

        ManterSocketNegocio.enviandoDadosViaSocket("localhost", 8787, OBJECTS);

//        Socket cliente = new Socket("localhost", 8787);
//
//        Disciplina disciplina = new Disciplina();
//        disciplina.setId(1);
//        disciplina.setNome("William");
//        disciplina.setProfessor("Felipe");
//
//        ObjectOutputStream output = new ObjectOutputStream(cliente.getOutputStream()); // saida de objeto da classe cliente
//        output.flush();
//        output.writeObject(disciplina);
//        output.reset();
//        output.close();
//        cliente.close(); // fechando acesso ao servidor
    }

}
