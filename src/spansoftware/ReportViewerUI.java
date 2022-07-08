/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package spansoftware;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author bhuva
 */
public class ReportViewerUI extends javax.swing.JFrame {

    private final Color span_blue = new Color(2, 80, 163);
    private final Color span_orange = new Color(249, 162, 25);
    int title_height_ = 100;
    private double left_panel_percentage_ = 0.3;
    private double right_panel_percentage_ = 0.7;

    /**
     * Creates new form SpanReport
     */
    public ReportViewerUI() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setUndecorated(true);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
        this.setAlwaysOnTop(false);
     //   this.pack();
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        JPanel title_panel = new JPanel();
        title_panel.setBackground(span_blue);
        title_panel.setBounds(0, 0, (int) screenSize.getWidth(), title_height_);
        ctrTitlePanel.add(title_panel);
       

        JPanel viewer_panel_container_ = new JPanel();
        viewer_panel_container_.setBackground(span_orange);
       // viewer_panel_container_.setLayout(new BorderLayout());

      //  viewer_panel_container_.setBounds(0, title_height_, (int) (screenSize.getWidth() * right_panel_percentage_), (int) screenSize.getHeight() - title_height_/*-(title_height_+bottom_height_)*/);
         viewer_panel_container_.setBounds(500, title_height_, (int) screenSize.getWidth(), 400);
       
        ctrViewerPanel.add(viewer_panel_container_);
        JPanel control_panel_container_ = new JPanel();
        control_panel_container_.setBorder(BorderFactory.createLineBorder(span_orange));
        control_panel_container_.setBounds((int)(screenSize.getWidth()* right_panel_percentage_), title_height_ - 1, (int)(screenSize.getWidth() * left_panel_percentage_), (int)screenSize.getHeight() - title_height_/*-(title_height_+bottom_height_)*/);
        control_panel_container_.setBackground(span_orange);
        ctrControlPanel.add(control_panel_container_);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ctrTitlePanel = new javax.swing.JPanel();
        ctrViewerPanel = new javax.swing.JPanel();
        ctrControlPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ctrTitlePanel.setPreferredSize(new java.awt.Dimension(1980, 33));

        javax.swing.GroupLayout ctrTitlePanelLayout = new javax.swing.GroupLayout(ctrTitlePanel);
        ctrTitlePanel.setLayout(ctrTitlePanelLayout);
        ctrTitlePanelLayout.setHorizontalGroup(
            ctrTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, Short.MAX_VALUE, Short.MAX_VALUE)
        );
        ctrTitlePanelLayout.setVerticalGroup(
            ctrTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        ctrViewerPanel.setBackground(new java.awt.Color(255, 255, 255));
        ctrViewerPanel.setMinimumSize(new java.awt.Dimension(1980, 1080));
        ctrViewerPanel.setPreferredSize(new java.awt.Dimension(1980, 33));

        javax.swing.GroupLayout ctrViewerPanelLayout = new javax.swing.GroupLayout(ctrViewerPanel);
        ctrViewerPanel.setLayout(ctrViewerPanelLayout);
        ctrViewerPanelLayout.setHorizontalGroup(
            ctrViewerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1980, Short.MAX_VALUE)
        );
        ctrViewerPanelLayout.setVerticalGroup(
            ctrViewerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ctrControlPanelLayout = new javax.swing.GroupLayout(ctrControlPanel);
        ctrControlPanel.setLayout(ctrControlPanelLayout);
        ctrControlPanelLayout.setHorizontalGroup(
            ctrControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );
        ctrControlPanelLayout.setVerticalGroup(
            ctrControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ctrViewerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctrTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(ctrControlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ctrTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ctrViewerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(ctrControlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(344, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     * @throws net.sf.jasperreports.engine.JRException
     */
    public static void main(String args[]) throws JRException {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportViewerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        /**
         * java.awt.EventQueue.invokeLater(new Runnable() { public void run() {
         * new SpanReport().setVisible(true); } });
         *
         */
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        /**
         * java.awt.EventQueue.invokeLater(new Runnable() { public void run() {
         * new SpanReport().setVisible(true); } });
         *
         */
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ctrControlPanel;
    private javax.swing.JPanel ctrTitlePanel;
    private javax.swing.JPanel ctrViewerPanel;
    // End of variables declaration//GEN-END:variables
}