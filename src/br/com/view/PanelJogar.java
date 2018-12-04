package br.com.view;

import br.com.kahoot.entidade.Disciplina;
import br.com.kahoot.entidade.Resposta;
import br.com.kahoot.entidade.Usuario;
import br.com.kahoot.principal.PrincipalCliente;
import java.awt.HeadlessException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class PanelJogar extends javax.swing.JPanel {

    public static Integer CONTAGEM_ATUAL = 1;
    public List<Resposta> RESPOSTAS_ATUAIS = new ArrayList<>();
    public static Usuario USUARIO_ATUAL = new Usuario();
    public static Integer GANHOU = 200;
    public static Integer PERDEU = 20;
    public static Integer PONTOS_DO_USUARIO = 0;

    /**
     * Creates new form PanelJogar
     */
    public PanelJogar() {
        initComponents();
        InetAddress ip;
        try {
            USUARIO_ATUAL.setNome(FramePrincipal.NOME_DO_USUARIO);
            USUARIO_ATUAL.setId(1);
            ip = InetAddress.getLocalHost();
            USUARIO_ATUAL.setIp(ip.getHostAddress());
        } catch (UnknownHostException unknownHostException) {
        }

        List<Disciplina> disciplinas = PrincipalCliente.DISCIPLINAS_RECEBIDAS;
        campoDisciplina.setText(disciplinas.get(0).getNome());
        campoAssunto.setText(PrincipalCliente.PERGUNTA_RECEBIDAS.get(0).getAssunto().getNome());
        List<Resposta> respostas = PrincipalCliente.RESPOSTAS_RECEBIDAS;
        for (int i = 0; i < respostas.size(); i++) {
            Resposta get = respostas.get(i);
            if (get.getPergunta().getId().equals(CONTAGEM_ATUAL)) {
                RESPOSTAS_ATUAIS.add(get);
            }
        }
        respostas = null;
        campoPergunta.setText(RESPOSTAS_ATUAIS.get(0).getPergunta().getPergunta());
        CampoResposta1.setText(RESPOSTAS_ATUAIS.get(0).getResposta());
        CampoResposta2.setText(RESPOSTAS_ATUAIS.get(1).getResposta());
        CampoResposta3.setText(RESPOSTAS_ATUAIS.get(2).getResposta());
        CampoResposta4.setText(RESPOSTAS_ATUAIS.get(3).getResposta());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        textoRespondaAQuestao = new javax.swing.JLabel();
        textoAssunto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoPergunta = new javax.swing.JTextArea();
        campoAssunto = new javax.swing.JTextField();
        textoDisciplina = new javax.swing.JLabel();
        campoDisciplina = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        botton1 = new javax.swing.JRadioButton();
        botton2 = new javax.swing.JRadioButton();
        botton3 = new javax.swing.JRadioButton();
        botton4 = new javax.swing.JRadioButton();
        CampoResposta1 = new javax.swing.JTextField();
        CampoResposta2 = new javax.swing.JTextField();
        CampoResposta3 = new javax.swing.JTextField();
        CampoResposta4 = new javax.swing.JTextField();
        BottonProximo = new javax.swing.JToggleButton();

        setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Desenvolvido por Agostinho, Adriene, kellison, William - SENAC PALHOÇA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel1, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        textoRespondaAQuestao.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        textoRespondaAQuestao.setText("Responda A Questão");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(textoRespondaAQuestao, gridBagConstraints);

        textoAssunto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        textoAssunto.setText("Assunto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(textoAssunto, gridBagConstraints);

        campoPergunta.setColumns(80);
        campoPergunta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        campoPergunta.setRows(10);
        jScrollPane1.setViewportView(campoPergunta);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(jScrollPane1, gridBagConstraints);

        campoAssunto.setColumns(30);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(campoAssunto, gridBagConstraints);

        textoDisciplina.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        textoDisciplina.setText("Disciplina");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(textoDisciplina, gridBagConstraints);

        campoDisciplina.setColumns(30);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(campoDisciplina, gridBagConstraints);

        add(jPanel2, new java.awt.GridBagConstraints());

        jPanel3.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        jPanel3.add(botton1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        jPanel3.add(botton2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        jPanel3.add(botton3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        jPanel3.add(botton4, gridBagConstraints);

        CampoResposta1.setColumns(75);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        jPanel3.add(CampoResposta1, gridBagConstraints);

        CampoResposta2.setColumns(75);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        jPanel3.add(CampoResposta2, gridBagConstraints);

        CampoResposta3.setColumns(75);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        jPanel3.add(CampoResposta3, gridBagConstraints);

        CampoResposta4.setColumns(75);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        jPanel3.add(CampoResposta4, gridBagConstraints);

        BottonProximo.setText("PROXIMO");
        BottonProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottonProximoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(BottonProximo, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(jPanel3, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void BottonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottonProximoActionPerformed
       

        if (validandoCheckBox()) return;

        validandoRespostaECalculandoPontos();

        System.out.println("Pontos finais depois de Responder uma Pergunta" + PONTOS_DO_USUARIO);
        CONTAGEM_ATUAL++;
        RESPOSTAS_ATUAIS = null;

        try {

            PrincipalCliente.panelUsuarioJogar();
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "FIM DE JOGO!");
        }
    }//GEN-LAST:event_BottonProximoActionPerformed

    private boolean validandoCheckBox() throws HeadlessException {
        /**
         * Se todos estiverem Selecionados
         */
        if (botton1.isSelected() && botton2.isSelected() && botton3.isSelected() && botton4.isSelected()) {
            JOptionPane.showMessageDialog(this, "Selecione apenas uma Resposta.");
            return true;
        }
        /**
         *  1 e 2
         */
        if (botton1.isSelected() && botton2.isSelected()) {
            JOptionPane.showMessageDialog(this, "Selecione apenas uma Resposta.");
            return true;
        }
        /**
         *  1 e 3
         */
        if (botton1.isSelected() && botton3.isSelected()) {
            JOptionPane.showMessageDialog(this, "Selecione apenas uma Resposta.");
            return true;
        }
        /**
         *  1 e 4
         */
        if (botton1.isSelected() && botton4.isSelected()) {
            JOptionPane.showMessageDialog(this, "Selecione apenas uma Resposta.");
            return true;
        }
        /**
         * 2 e 1
         */
        if (botton2.isSelected() && botton1.isSelected()) {
            JOptionPane.showMessageDialog(this, "Selecione apenas uma Resposta.");
            return true;
        }
        /**
         *  2 e 3
         */
        if (botton2.isSelected() && botton3.isSelected()) {
            JOptionPane.showMessageDialog(this, "Selecione apenas uma Resposta.");
            return true;
        }
        /**
         *  2 e 4
         */
        if (botton2.isSelected() && botton4.isSelected()) {
            JOptionPane.showMessageDialog(this, "Selecione apenas uma Resposta.");
            return true;
        }
        /**
         * 3 e 1
         */
        if (botton3.isSelected() && botton1.isSelected()) {
            JOptionPane.showMessageDialog(this, "Selecione apenas uma Resposta.");
            return true;
        }
        /**
         * 3 e 2
         */
        if (botton3.isSelected() && botton2.isSelected()) {
            JOptionPane.showMessageDialog(this, "Selecione apenas uma Resposta.");
            return true;
        }
        /**
         * 3 e 4
         */
        if (botton3.isSelected() && botton4.isSelected()) {
            JOptionPane.showMessageDialog(this, "Selecione apenas uma Resposta.");
            return true;
        }
        /**
         * 4 e 1
         */
        if (botton4.isSelected() && botton1.isSelected()) {
            JOptionPane.showMessageDialog(this, "Selecione apenas uma Resposta.");
            return true;
        }
        /**
         * 4 e 2
         */
        if (botton4.isSelected() && botton2.isSelected()) {
            JOptionPane.showMessageDialog(this, "Selecione apenas uma Resposta.");
            return true;
        }
        /**
         * 4 e 3
         */
        if (botton4.isSelected() && botton3.isSelected()) {
            JOptionPane.showMessageDialog(this, "Selecione apenas uma Resposta.");
            return true;
        }
        return false;
    }

    private void validandoRespostaECalculandoPontos() {
        // TODO add your handling code here:

        /**
         * Primeira CheckBox
         */
        if (botton1.isSelected() && RESPOSTAS_ATUAIS.get(0).getCorreta() == true) {
            PONTOS_DO_USUARIO = PONTOS_DO_USUARIO + GANHOU;
        }
        if (botton1.isSelected() && RESPOSTAS_ATUAIS.get(0).getCorreta() == false) {
            PONTOS_DO_USUARIO = PONTOS_DO_USUARIO - PERDEU;
        }
        /**
         * Segunda CheckBox
         */
        if (botton2.isSelected() && RESPOSTAS_ATUAIS.get(1).getCorreta() == true) {
            PONTOS_DO_USUARIO = PONTOS_DO_USUARIO + GANHOU;
        }
        if (botton2.isSelected() && RESPOSTAS_ATUAIS.get(1).getCorreta() == false) {
            PONTOS_DO_USUARIO = PONTOS_DO_USUARIO - PERDEU;
        }
        /**
         * Terceira Checkbox
         */
        if (botton3.isSelected() && RESPOSTAS_ATUAIS.get(2).getCorreta() == true) {
            PONTOS_DO_USUARIO = PONTOS_DO_USUARIO + GANHOU;
        }
        if (botton3.isSelected() && RESPOSTAS_ATUAIS.get(2).getCorreta() == false) {
            PONTOS_DO_USUARIO = PONTOS_DO_USUARIO - PERDEU;
        }
        /**
         * Quarta checkbox
         */
        if (botton4.isSelected() && RESPOSTAS_ATUAIS.get(3).getCorreta() == true) {
            PONTOS_DO_USUARIO = PONTOS_DO_USUARIO + GANHOU;
        }
        if (botton4.isSelected() && RESPOSTAS_ATUAIS.get(3).getCorreta() == false) {
            PONTOS_DO_USUARIO = PONTOS_DO_USUARIO - PERDEU;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BottonProximo;
    private javax.swing.JTextField CampoResposta1;
    private javax.swing.JTextField CampoResposta2;
    private javax.swing.JTextField CampoResposta3;
    private javax.swing.JTextField CampoResposta4;
    private javax.swing.JRadioButton botton1;
    private javax.swing.JRadioButton botton2;
    private javax.swing.JRadioButton botton3;
    private javax.swing.JRadioButton botton4;
    private javax.swing.JTextField campoAssunto;
    private javax.swing.JTextField campoDisciplina;
    private javax.swing.JTextArea campoPergunta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel textoAssunto;
    private javax.swing.JLabel textoDisciplina;
    private javax.swing.JLabel textoRespondaAQuestao;
    // End of variables declaration//GEN-END:variables
}
