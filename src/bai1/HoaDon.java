/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.ArrayList;

/**
 *
 * @author tohie
 */
public class HoaDon {
    ArrayList<CTHD> DSCTHD = new ArrayList<>();
    HoaDonHeader HDH;
  protected HoaDon(Builder builder) {
        this.HDH = builder.HDH;
        this.DSCTHD = builder.DSCTHD;
    }
     public static class Builder{
    ArrayList<CTHD> DSCTHD = new ArrayList<>();
    HoaDonHeader HDH;

        public Builder addHDH(HoaDonHeader HDH) {
            this.HDH = HDH;
            return this;
        }
         public Builder addCTHD(CTHD cthd) {
            this.DSCTHD.add(cthd);
            return this;
        }
         public HoaDon build()
         {
             return new HoaDon(this);
         }
    }

    @Override
    public String toString() {
       String s = HDH.toString();
        for(int i=0; i<DSCTHD.size(); i++){
            s += "\n"+DSCTHD.get(i).toString();
        }
        return s;
    }

 
    
    
    
}
