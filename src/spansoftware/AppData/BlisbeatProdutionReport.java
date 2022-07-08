/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spansoftware.AppData;

import DataClass.Blisbeat;
import DataClass.Production;
import DataClass.Productioninterface;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import spansoftware.Database;

/**
 *
 * @author bhuva
 */
public class BlisbeatProdutionReport {

    private Database db_ = null;

    public BlisbeatProdutionReport(Database db) {
        this.db_ = db;
    }

    public ArrayList<Blisbeat> getBlishbeatdata() throws SQLException {
        Statement stm;
        stm = db_.getDBConnection();
        ResultSet rst;
        String sql = "Select * From span_db.batch ";
        
       rst = stm.executeQuery(sql);
        ArrayList<Blisbeat> data = new ArrayList<>();
        // ArrayList<Production> data = new ArrayList<>();
        while (rst.next()) {
            // Customer customer = new Customer(rst.getString("id"), rst.getString("name"), rst.getString("address"), rst.getDouble("salary"));
            //customerList.add(customer);

           Blisbeat batch1 = new Blisbeat(rst.getString("BatchNo"), rst.getInt("id"), rst.getString("Status"), rst.getInt("Size"), rst.getString("CreatedOn"), rst.getString("ModifiedOn"), rst.getString("InspectedOn"), rst.getString("CreatedBy")); 
            data.add(batch1);
            
        }
        return data;
    }

    public JasperPrint getJasperPrint() throws JRException {
        try {
            ArrayList<Blisbeat> dataList = getBlishbeatdata();
            JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(dataList);
            JasperReport jasperReport = JasperCompileManager.compileReport("D:\\report5.jrxml");
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, beanColDataSource);
            // JasperViewer.viewReport(jasperPrint);
            return jasperPrint;
        } catch (SQLException ex) {
            Logger.getLogger(BlisbeatProdutionReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
