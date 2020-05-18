/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import static bai3.ShapeType.Circle;
import static bai3.ShapeType.Rectangle;
import static bai3.ShapeType.Triangle;

/**
 *
 * @author tohie
 */
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// ----Trc Khi cai Singleton-----
//       var Fac = new ShapeFactory();
//       Shape shape = Fac.CreateShape(Circle);
//        System.out.println(shape.toString());
//-----------------

//Sau khi cai Singleton
    var FacSingleton1= ShapeFactory.createIsntance();
        FacSingleton1.setCount(1);
    var FacSingleton2= ShapeFactory.createIsntance();
        FacSingleton2.setCount(2);
        System.out.println("neu Singleton hoat dong thi count Fac1"
                + " Chinh la count Fac2"
                +"\n count1 ="+FacSingleton1.getCount()
                +"\n count2 ="+FacSingleton1.getCount());
        
    //Ve Hinh Chu Nhat va Tam Giac    
        Shape shape = FacSingleton1.CreateShape(Rectangle);
        Shape shape2 = FacSingleton2.CreateShape(Triangle);
        System.out.println(shape.toString());
        System.out.println(shape2.toString());
            
    }
    
}
