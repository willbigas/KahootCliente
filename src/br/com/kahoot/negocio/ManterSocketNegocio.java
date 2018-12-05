package br.com.kahoot.negocio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author William
 */
public class ManterSocketNegocio {

    public static Object recebendoDadosViaSocket(Integer porta) throws IOException, ClassNotFoundException, InterruptedException {
        ServerSocket servidor = new ServerSocket(porta);
        Socket entradaDados = servidor.accept();
        ObjectInputStream input = new ObjectInputStream(entradaDados.getInputStream());
        Object objRecebido = input.readObject();
        servidor.close();
        entradaDados.close();
        return objRecebido;
    }

    public static void enviandoDadosViaSocket(String enderecoIp, Integer porta, Object objParaEnviar) throws Exception {
        InetAddress endereco = InetAddress.getByName(enderecoIp);
        Socket saidaDados = new Socket(endereco, porta);
        ObjectOutputStream saida = new ObjectOutputStream(saidaDados.getOutputStream()); // saida de objeto da classe cliente
        saida.flush();
        saida.writeObject(objParaEnviar);
        saida.close();
        saidaDados.close(); // fechando acesso ao servidor

    }

    public static Object recebendoDadosViaSocketInfinitamente(Integer porta) throws IOException, ClassNotFoundException, InterruptedException {
        ServerSocket servidor = new ServerSocket(porta);
        Object objRecebido = null;
        Socket entradaDados = null;
        while (true) {
            entradaDados = servidor.accept();
            ObjectInputStream input = new ObjectInputStream(entradaDados.getInputStream());
            objRecebido = input.readObject();
            if (objRecebido.equals("quit!")) {
                break;
            }
        }
        servidor.close();
        entradaDados.close();
        return objRecebido;
    }
}
