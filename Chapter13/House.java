/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13;

import java.util.Date;

/**
 *
 * @author Java
 */
public class House implements Cloneable, Comparable<House> {

    private int id;
    public double area;
    private Date whenBuilt;

    public House(int id, double area) {
        this.id = id;
        this.area = area;
        whenBuilt = new java.util.Date();
    }

    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public Date getWhenBuilt() {
        return whenBuilt;
    }

    /**
     *
     * @return @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        //shallow copy
        House houseClone = (House) super.clone();
        //deep copy on whenBuilt
        houseClone.whenBuilt = (Date) (whenBuilt.clone());
        return houseClone;
    }

    @Override
    public int compareTo(House o) {
        if (area > o.area) {
            return 1;
        } else if (area < o.area) {
            return -1;
        } else {
            return 0;
        }
    }
}
