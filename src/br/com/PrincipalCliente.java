package br.com;

import br.com.kahoot.entidade.Disciplina;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author William
 */
public class PrincipalCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        Socket cliente = new Socket("localhost", 8787);

        Disciplina disciplina = new Disciplina();
        disciplina.setId(1);
        disciplina.setNome("William");
        disciplina.setProfessor("Felipe");

        ObjectOutputStream output = new ObjectOutputStream(cliente.getOutputStream()); // saida de objeto da classe cliente
        output.flush();
        output.writeObject(disciplina);
        output.reset();
        output.close();
        cliente.close(); // fechando acesso ao servidor
    }

}
