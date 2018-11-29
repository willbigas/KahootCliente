package br.com.view;

import br.com.kahoot.entidade.Disciplina;
import br.com.kahoot.entidade.Pergunta;
import br.com.kahoot.principal.PrincipalCliente;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class PanelJogar extends javax.swing.JPanel {

    /**
     * Creates new form PanelJogar
     */
    public PanelJogar(List<Pergunta> perguntas) {
        initComponents();
        for (int i = 0; i < perguntas.size(); i++) {
            Pergunta get = perguntas.get(i);
            campoPergunta.setText(get.getPergunta());
        }
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
        jPanel1 = new javax.swing.JPanel();
        botton1 = new javax.swing.JButton();
        botton3 = new javax.swing.JButton();
        botton2 = new javax.swing.JButton();
        botton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        textoRespondaAQuestao = new javax.swing.JLabel();
        textoAssunto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoPergunta = new javax.swing.JTextArea();
        campoAssunto = new javax.swing.JTextField();
        textoDisciplina = new javax.swing.JLabel();
        campoDisciplina = new javax.swing.JTextField();

        setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Desenvolvido por Agostinho, Adriene, kellison, William - SENAC PALHOÇA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel1, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        botton1.setBackground(new java.awt.Color(255, 255, 255));
        botton1.setFont(new java.awt.Font("Dialog", 1, 80)); // NOI18N
        botton1.setText("teste");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 71;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(botton1, gridBagConstraints);

        botton3.setBackground(new java.awt.Color(255, 255, 255));
        botton3.setFont(new java.awt.Font("Dialog", 1, 80)); // NOI18N
        botton3.setText("teste");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 71;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(botton3, gridBagConstraints);

        botton2.setBackground(new java.awt.Color(255, 255, 255));
        botton2.setFont(new java.awt.Font("Dialog", 1, 80)); // NOI18N
        botton2.setText("teste");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 55;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(botton2, gridBagConstraints);

        botton4.setBackground(new java.awt.Color(255, 255, 255));
        botton4.setFont(new java.awt.Font("Dialog", 1, 80)); // NOI18N
        botton4.setText("teste");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 55;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(botton4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jPanel1, gridBagConstraints);

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

        campoPergunta.setColumns(90);
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
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botton1;
    private javax.swing.JButton botton2;
    private javax.swing.JButton botton3;
    private javax.swing.JButton botton4;
    private javax.swing.JTextField campoAssunto;
    private javax.swing.JTextField campoDisciplina;
    private javax.swing.JTextArea campoPergunta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel textoAssunto;
    private javax.swing.JLabel textoDisciplina;
    private javax.swing.JLabel textoRespondaAQuestao;
    // End of variables declaration//GEN-END:variables
}
