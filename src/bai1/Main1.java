/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author tohie
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HoaDonHeader HDH = new HoaDonHeader("HD01","21/07/1999","To Hieu Ngoi");
        var CTHD1 = new CTHD("Khoai Lang",14,2000, (float) 0.1);
        var CTHD2 = new CTHD("Xoai",100,18000, (float) 0.1);
        var CTHD3 = new CTHD("Nho",120,60000, (float) 0.2);
        
        var HoaDon = new HoaDon.Builder()
                .addHDH(HDH)
                .addCTHD(CTHD1)
                .addCTHD(CTHD2)
                .addCTHD(CTHD3)
                .build();               
        System.out.println(HoaDon.toString());
    }
    
}
