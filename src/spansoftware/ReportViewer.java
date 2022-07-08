/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package spansoftware;

import java.sql.SQLException;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author bhuva
 */
public class ReportViewer {

    
    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JRException, ClassNotFoundException, SQLException {
        // TODO code application logic here
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new ReportViewerUI();
            }
        });
    }
    
}
