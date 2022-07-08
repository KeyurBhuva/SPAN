/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataClass;

/**
 *
 * @author bhuva
 */
public class Blisbeat extends Production {

    int area;
    int length;
    int width;
    int shape;
    int broken;
    int productcolor;
    int darkspot;
    int brightspot;
    int edgespot;
    int colordistribution;
    int orientation;
    int foreignobjectinCavity;

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getShape() {
        return shape;
    }

    public void setShape(int shape) {
        this.shape = shape;
    }

    public int getBroken() {
        return broken;
    }

    public void setBroken(int broken) {
        this.broken = broken;
    }

    public int getProductcolor() {
        return productcolor;
    }

    public void setProductcolor(int productcolor) {
        this.productcolor = productcolor;
    }

    public int getDarkspot() {
        return darkspot;
    }

    public void setDarkspot(int darkspot) {
        this.darkspot = darkspot;
    }

    public int getBrightspot() {
        return brightspot;
    }

    public void setBrightspot(int brightspot) {
        this.brightspot = brightspot;
    }

    public int getEdgespot() {
        return edgespot;
    }

    public void setEdgespot(int edgespot) {
        this.edgespot = edgespot;
    }

    public int getColordistribution() {
        return colordistribution;
    }

    public void setColordistribution(int colordistribution) {
        this.colordistribution = colordistribution;
    }

    public int getOrientation() {
        return orientation;
    }

    public void setOrientation(int orientation) {
        this.orientation = orientation;
    }

    public int getForeignobjectinCavity() {
        return foreignobjectinCavity;
    }

    public void setForeignobjectinCavity(int foreignobjectinCavity) {
        this.foreignobjectinCavity = foreignobjectinCavity;
    }

    public Blisbeat(int area, int length, int width, int shape, int broken, int productcolor, int darkspot, int brightspot, int edgespot, int colordistribution, int orientation, int foreignobjectinCavity) {
        this.area = area;
        this.length = length;
        this.width = width;
        this.shape = shape;
        this.broken = broken;
        this.productcolor = productcolor;
        this.darkspot = darkspot;
        this.brightspot = brightspot;
        this.edgespot = edgespot;
        this.colordistribution = colordistribution;
        this.orientation = orientation;
        this.foreignobjectinCavity = foreignobjectinCavity;
    }

    public Blisbeat(String batchNo, int id, String status, int size, String createdOn, String modifiedOn, String inspectedOn, String createdBy) {
        super(batchNo, id, status, size, createdOn, modifiedOn, inspectedOn, createdBy);
    }




    

    

}
