/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author tohie
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var MyStr = new MyStringBuilder.Builder()
                .addString("Khoai Lang")
                .addFloat((float)0.2)
                .addBoolean(true)
                .build();
        System.out.println(MyStr.toString());
    }
    
}
