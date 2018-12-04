/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;

import br.com.kahoot.principal.PrincipalCliente;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class FramePrincipal extends javax.swing.JFrame {

    public static String NOME_DO_USUARIO = "";

    /**
     * Creates new form FramePrincipal
     */
    public FramePrincipal() {

        initComponents();

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

        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BotaoPlacar = new javax.swing.JButton();
        BotaoJogar = new javax.swing.JButton();
        BotaoSair = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());
        getContentPane().add(jLabel2, new java.awt.GridBagConstraints());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/LabelQuiz.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jLabel1, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        BotaoPlacar.setBackground(new java.awt.Color(153, 153, 153));
        BotaoPlacar.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        BotaoPlacar.setForeground(new java.awt.Color(0, 0, 0));
        BotaoPlacar.setText("PLACAR");
        BotaoPlacar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(BotaoPlacar, gridBagConstraints);

        BotaoJogar.setBackground(new java.awt.Color(153, 153, 153));
        BotaoJogar.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        BotaoJogar.setForeground(new java.awt.Color(119, 61, 4));
        BotaoJogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/BotaoJogar.png"))); // NOI18N
        BotaoJogar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BotaoJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoJogarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(BotaoJogar, gridBagConstraints);

        BotaoSair.setBackground(new java.awt.Color(153, 153, 153));
        BotaoSair.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        BotaoSair.setForeground(new java.awt.Color(0, 0, 0));
        BotaoSair.setText("SAIR");
        BotaoSair.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(BotaoSair, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
        setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoSairActionPerformed

    private void BotaoJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoJogarActionPerformed
        String mensagem = JOptionPane.showInputDialog(this, "Digite seu nome");
        NOME_DO_USUARIO = mensagem;
        PrincipalCliente.USUARIO_ATUAL.setNome(NOME_DO_USUARIO);
        try {
            PrincipalCliente.panelUsuarioJogar();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_BotaoJogarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoJogar;
    private javax.swing.JButton BotaoPlacar;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
