/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author tohie
 */
public abstract class Shape {
    private String brush=" Ve Bang Tia Muc lazer";
    private String paper="Giay A4 xin";
    private String frame= " Khung Nhua"; 
    public abstract String draw();

    @Override
    public String toString() {
        return "Shape{" + "brush=" + brush + ", paper=" + paper + ", frame=" + frame + draw() +'}';
    }

   
   
    
}
