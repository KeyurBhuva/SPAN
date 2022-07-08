/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataClass;

/**
 *
 * @author bhuva
 */
public class Production {

    String batchNo;
    int id;
    String status;
    int size;
    String createdOn;
    String modifiedOn;
    String inspectedOn;
    String createdBy;
    int accept;
    int reject;

    public int getAccept() {
        return accept;
    }

    public void setAccept(int accept) {
        this.accept = accept;
    }

    public int getReject() {
        return reject;
    }

    public void setReject(int reject) {
        this.reject = reject;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    int total;

    public Production(String batchNo, int id, String status, int size, String createdOn, String modifiedOn, String inspectedOn, String createdBy) {
        this.batchNo = batchNo;
        this.id = id;
        this.status = status;
        this.size = size;
        this.createdOn = createdOn;
        this.modifiedOn = modifiedOn;
        this.inspectedOn = inspectedOn;
        this.createdBy = createdBy;
    }


  
    Production() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(String modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public String getInspectedOn() {
        return inspectedOn;
    }

    public void setInspectedOn(String inspectedOn) {
        this.inspectedOn = inspectedOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

}
