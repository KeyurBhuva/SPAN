/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spansoftware;

import spansoftware.AppData.BlisbeatProdutionReport;
import java.util.ArrayList;

/**
 *
 * @author Niraj
 */
public class ProductionReport {

    private Database db_ = null;
    private String application_name_ = "";
    private String component_name_ = "";
    private String logged_in_user_name_ = "";
    private ArrayList<String> model_name_ = new ArrayList<>();
    private ArrayList<String> batch_number_ = new ArrayList<>();
    private String start_date_ = "";
    private String end_date_ = "";
    private String user_name_ = "";
    private BlisbeatProdutionReport blisbeat_production_report_ = null;

    public ProductionReport(Database db) {
        db_ = db;
    }

    ProductionReport() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void Generate() {
        //General info arraylist
        //aplication specific arraylist
        //Load template - jrxml
        //fill
    }

}
