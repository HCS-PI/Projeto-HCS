/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hcs.view;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.util.Conversor;
import hcs.coleta.dados.DadosCpu;
import hcs.coleta.dados.DadosMemoriaRam;
import hcs.coleta.dados.InserirDados;
import hcs.graficos.GraficoCpuTask;
import hcs.graficos.GraficoRam;
import hcs.graficos.GraficoRamTask;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYDataset;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author ricar
 */
public final class Ram extends javax.swing.JFrame {
    
    GraficoRam grafico = new GraficoRam("Monitoramento RAM");

    /**
     * Creates new form Ram
     */
    public Ram() 
    {
        URL caminhoIcone = getClass().getResource("/assets/hcs.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo);
        
        initComponents();
        
        //grafico
        grafico.pack();
        RefineryUtilities.centerFrameOnScreen(grafico);
        Grafico();
        GraficoRamTask taskRam = new GraficoRamTask(grafico);
        Timer timer = new Timer("Grafico linha");
        timer.schedule(taskRam, 0, 3000);

        Looca looca = new Looca();
        Conversor conversor = new Conversor();
        
        DadosCpu dadosCpu = new DadosCpu();
        DadosMemoriaRam dadosRam = new DadosMemoriaRam();
        
        InserirDados insertDados = new InserirDados();

        informacoesRam();

        Timer temporizador = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                insertDados.inserirDadosCpu();
                insertDados.inserirDadosRam();
                insertDados.inserirDadosTemperatura();
            }
        };

        temporizador.schedule(task, 0, 1000);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnSistema = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        panelHome = new javax.swing.JPanel();
        graficoRam = new javax.swing.JPanel();
        panelNucleos = new javax.swing.JPanel();
        lblRamEmUso = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblRamTotal = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblRamDisponivel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hardware Control System - Dashboard RAM");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelHeader.setBackground(new java.awt.Color(4, 30, 84));
        panelHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hardware Control System");
        jLabel4.setPreferredSize(new java.awt.Dimension(250, 250));
        panelHeader.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 500, 40));

        getContentPane().add(panelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 60));

        panelMenu.setBackground(new java.awt.Color(9, 22, 112));
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(25, 120, 220));
        jButton1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/thermometerIconWhite.png"))); // NOI18N
        jButton1.setText("TEMP ");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setRolloverEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelMenu.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 140, 70));

        btnSistema.setBackground(new java.awt.Color(25, 120, 220));
        btnSistema.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btnSistema.setForeground(new java.awt.Color(255, 255, 255));
        btnSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/managementIconWhite.png"))); // NOI18N
        btnSistema.setText("SISTEMA");
        btnSistema.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSistema.setRolloverEnabled(false);
        btnSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSistemaActionPerformed(evt);
            }
        });
        panelMenu.add(btnSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, 70));

        jButton3.setBackground(new java.awt.Color(25, 120, 220));
        jButton3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/cpuIconWhite.png"))); // NOI18N
        jButton3.setText("CPU");
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.setRolloverEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panelMenu.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 140, 70));

        jButton4.setBackground(new java.awt.Color(25, 120, 220));
        jButton4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/hardDiscIconWhite.png"))); // NOI18N
        jButton4.setText("DISCO");
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.setRolloverEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panelMenu.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, 70));

        jButton5.setBackground(new java.awt.Color(0, 75, 200));
        jButton5.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ramIconWhite.png"))); // NOI18N
        jButton5.setText("RAM");
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.setRolloverEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        panelMenu.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 140, 70));

        getContentPane().add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 180, 580));

        panelHome.setBackground(new java.awt.Color(110, 124, 255));
        panelHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout graficoRamLayout = new javax.swing.GroupLayout(graficoRam);
        graficoRam.setLayout(graficoRamLayout);
        graficoRamLayout.setHorizontalGroup(
            graficoRamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        graficoRamLayout.setVerticalGroup(
            graficoRamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        panelHome.add(graficoRam, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 860, 430));

        panelNucleos.setBackground(new java.awt.Color(56, 93, 118));
        panelNucleos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRamEmUso.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        lblRamEmUso.setForeground(new java.awt.Color(255, 255, 255));
        panelNucleos.add(lblRamEmUso, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 140, 70));

        jLabel10.setBackground(new java.awt.Color(204, 255, 204));
        jLabel10.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 25)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Disponível:");
        jLabel10.setPreferredSize(new java.awt.Dimension(250, 250));
        panelNucleos.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 140, 70));

        jLabel12.setBackground(new java.awt.Color(204, 255, 204));
        jLabel12.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 25)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Espaço Total:");
        jLabel12.setPreferredSize(new java.awt.Dimension(250, 250));
        panelNucleos.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 170, 70));

        lblRamTotal.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        lblRamTotal.setForeground(new java.awt.Color(255, 255, 255));
        panelNucleos.add(lblRamTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 120, 70));

        jLabel13.setBackground(new java.awt.Color(204, 255, 204));
        jLabel13.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 25)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Em Uso:");
        jLabel13.setPreferredSize(new java.awt.Dimension(250, 250));
        panelNucleos.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 100, 70));

        lblRamDisponivel.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        lblRamDisponivel.setForeground(new java.awt.Color(255, 255, 255));
        panelNucleos.add(lblRamDisponivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 130, 70));

        panelHome.add(panelNucleos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 860, 70));

        getContentPane().add(panelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 900, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Temp().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSistemaActionPerformed
        new Sistema().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSistemaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Cpu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Disco().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new Ram().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Ram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ram().setVisible(true);
            }
        });
    }
    
    public void informacoesRam() {
        // Informações RAM
        DadosMemoriaRam dadosRam = new DadosMemoriaRam();
        
        lblRamTotal.setText(dadosRam.getMemoriaTotalGb());
        
        lblRamEmUso.setText(dadosRam.getMemoriaUsoGb());
        
        lblRamDisponivel.setText(dadosRam.getMemoriaDisponivelGb());

    }   
    
    public void Grafico()  {

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        final XYDataset dataset = grafico.gerarDataSetInicial();

        JFreeChart chart = grafico.gerarGrafico(dataset);
                graficoRam.setVisible(true);

                ChartPanel pane = new ChartPanel(chart);
                pane.setDomainZoomable(true);
                
                pane.setVisible(true);
                
                   graficoRam.setLayout(new BorderLayout());
                   
                     graficoRam.add(pane, BorderLayout.NORTH);
                

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSistema;
    private javax.swing.JPanel graficoRam;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblRamDisponivel;
    private javax.swing.JLabel lblRamEmUso;
    private javax.swing.JLabel lblRamTotal;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelNucleos;
    // End of variables declaration//GEN-END:variables
}
